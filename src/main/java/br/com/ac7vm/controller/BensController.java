package br.com.ac7vm.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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

import br.com.ac7vm.model.Bens;
import br.com.ac7vm.model.Obra;
import br.com.ac7vm.repository.BensRepository;
import br.com.ac7vm.util.Conversor;

@CrossOrigin
@RestController	
@RequestMapping("/bens")
public class BensController {
	
	@Autowired
	private BensRepository bensRepository;
	
	@GetMapping
	@Cacheable("consultaBens")
	public ResponseEntity<Optional<List<Bens>>> listar() {
		Conversor c = new Conversor();
		Date data = c.SomarDiasData(new Date(), -90);
		Optional<List<Bens>> lista = bensRepository.findAllBens(data);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("descricao/{descricao}")
	@Cacheable("consultaBens")
	public ResponseEntity<Optional<List<Bens>>> listarDescricao(@PathVariable("descricao") String descricao) {
		Optional<List<Bens>> lista = bensRepository.findAllBensDescricao(descricao);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("planocontas/{idplanocontas}")
	@Cacheable("consultaBens")
	public ResponseEntity<Optional<List<Bens>>> listarPlanoContas(@PathVariable("idplanocontas") int idPlanoContas) {
		Optional<List<Bens>> lista = bensRepository.findAllBensPlanoContas(idPlanoContas);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Bens>> pesquisar(@PathVariable("id") int id) {
		Optional<Bens> bem = bensRepository.findById(id);
		if (bem==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(bem);
	}
	
	@PostMapping("/salvar")
	@CachePut("consultaBens")
	@ResponseStatus(HttpStatus.CREATED)
	public Bens salvar(@Valid @RequestBody Bens bens) {
		return bensRepository.save(bens);
	}

}
