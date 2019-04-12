package br.com.ac7vm.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Planoconta;
import br.com.ac7vm.repository.PlanoContaRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/planocontas")
public class PlanoContaController {
	
	@Autowired
	private PlanoContaRepository planoContaRepository;
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<Optional<List<Planoconta>>> pesquisar(@PathVariable("descricao") String descricao) {
		Optional<List<Planoconta>> lista = planoContaRepository.findByDescricaoContainingOrderByDescricao(descricao);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Planoconta>> pesquisar(@PathVariable("id") int id) {
		Optional<Planoconta> lista = planoContaRepository.findById(id);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping
	@Cacheable("consultaPlanoContas")
	public ResponseEntity<List<Planoconta>> listar() {
		Sort sort = new Sort(Sort.Direction.ASC, "Nome");
		List<Planoconta> lista = planoContaRepository.findAll(sort);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping
	@CachePut("consultaPlanoContas")
	@ResponseStatus(HttpStatus.CREATED)
	public Planoconta salvar(@Valid @RequestBody Planoconta Planoconta) {
		return planoContaRepository.save(Planoconta);
	}

}
