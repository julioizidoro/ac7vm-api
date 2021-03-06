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

import br.com.ac7vm.model.Obra;
import br.com.ac7vm.repository.ObraRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/obras")
public class ObraController {
	
	@Autowired
	private ObraRepository obraRepository;
	
	@GetMapping("nome/{nome}")
	public ResponseEntity<Optional<List<Obra>>> pesquisar(@PathVariable("nome") String nome) {
		Optional<List<Obra>> lista = obraRepository.findByNomeContainingOrderByNome(nome);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Obra>> pesquisar(@PathVariable("id") int id) {
		Optional<Obra> lista = obraRepository.findById(id);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping
	@Cacheable("consultaObras")
	public ResponseEntity<List<Obra>> listar() {
		Sort sort = new Sort(Sort.Direction.ASC, "Nome");
		List<Obra> lista = obraRepository.findAll(sort);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping("/salvar")
	@CachePut("consultaObras")
	@ResponseStatus(HttpStatus.CREATED)
	public Obra salvar(@Valid @RequestBody Obra Obra) {
		return obraRepository.save(Obra);
	}

}
