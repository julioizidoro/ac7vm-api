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

import br.com.ac7vm.model.Obrafase;
import br.com.ac7vm.repository.ObraFaseRepository;



@CrossOrigin("*")
@RestController
@RequestMapping("/faseobras")
public class ObraFaseController {
	
	@Autowired
	private ObraFaseRepository obraFaseRepository;
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<Optional<List<Obrafase>>> pesquisar(@PathVariable("descricao") String descricao) {
		Optional<List<Obrafase>> lista = obraFaseRepository.findByDescricaoContainingOrderByDescricao(descricao);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Obrafase>> pesquisar(@PathVariable("id") int id) {
		Optional<Obrafase> lista = obraFaseRepository.findById(id);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping
	@Cacheable("consultaObrafase")
	public ResponseEntity<List<Obrafase>> listar() {
		Sort sort = new Sort(Sort.Direction.ASC, "Descricao");
		List<Obrafase> lista = obraFaseRepository.findAll(sort);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping
	@CachePut("consultaObrafase")
	@ResponseStatus(HttpStatus.CREATED)
	public Obrafase salvar(@Valid @RequestBody Obrafase Obrafase) {
		return obraFaseRepository.save(Obrafase);
	}

}
