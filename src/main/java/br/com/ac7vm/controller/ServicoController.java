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

import br.com.ac7vm.model.Servico;
import br.com.ac7vm.repository.ServicoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/servicos")
public class ServicoController {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<Optional<List<Servico>>> pesquisar(@PathVariable("descricao") String descricao) {
		Optional<List<Servico>> lista = servicoRepository.findByDescricaoContainingOrderByDescricao(descricao);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("conta/{conta}")
	public ResponseEntity<Optional<List<Servico>>> pesquisarConta(@PathVariable("conta") String conta) {
		Optional<List<Servico>> lista = servicoRepository.findByContaContainingOrderByDescricao(conta);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Servico>> pesquisar(@PathVariable("id") int id) {
		Optional<Servico> lista = servicoRepository.findById(id);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping
	@Cacheable("consultaServicos")
	public ResponseEntity<List<Servico>> listar() {
		Sort sort = new Sort(Sort.Direction.ASC, "descricao");
		List<Servico> lista = servicoRepository.findAll(sort);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping("/salvar")
	@CachePut("consultaServicos")
	@ResponseStatus(HttpStatus.CREATED)
	public Servico salvar(@Valid @RequestBody Servico Servico) {
		return servicoRepository.save(Servico);
	}

}
