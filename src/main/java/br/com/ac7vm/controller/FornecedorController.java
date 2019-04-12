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

import br.com.ac7vm.model.Fornecedor;
import br.com.ac7vm.repository.FornecedorRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@GetMapping("nome/{nome}")
	public ResponseEntity<Optional<List<Fornecedor>>> pesquisar(@PathVariable("nome") String nome) {
		Optional<List<Fornecedor>> lista = fornecedorRepository.findByNomeContainingOrderByNome(nome);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Fornecedor>> pesquisar(@PathVariable("id") int id) {
		Optional<Fornecedor> lista = fornecedorRepository.findById(id);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping
	@Cacheable("consultaFornecedores")
	public ResponseEntity<List<Fornecedor>> listar() {
		Sort sort = new Sort(Sort.Direction.ASC, "Nome");
		List<Fornecedor> lista = fornecedorRepository.findAll(sort);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping
	@CachePut("consultaFornecedores")
	@ResponseStatus(HttpStatus.CREATED)
	public Fornecedor salvar(@Valid @RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

}
