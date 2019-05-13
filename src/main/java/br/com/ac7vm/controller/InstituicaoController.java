package br.com.ac7vm.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.ac7vm.model.Instituicao;
import br.com.ac7vm.repository.InstituicaoRepository;

@CrossOrigin
@RestController
@RequestMapping("/instituicao")
public class InstituicaoController {
	
	@Autowired
	private InstituicaoRepository instituicaoResository;
	
	@GetMapping("listar/{tipo}")
	public ResponseEntity<Optional<List<Instituicao>>> listar(@PathVariable("tipo") String tipo) {
		Optional<List<Instituicao>> lista = instituicaoResository.findByTipoOrderByNome(tipo);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("listar/{nome}/email")
	public ResponseEntity<Optional<List<Instituicao>>> listar(@PathVariable("nome") String nome, @PathVariable("email") String email) {
		Optional<List<Instituicao>> lista = instituicaoResository.findByNomeContainingOrEmailContainingOrderByNome(nome, email);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Instituicao>> listar(@PathVariable("id") int id) {
		Optional<Instituicao> instituicao = instituicaoResository.findById(id);
		if (instituicao==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(instituicao);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Instituicao salvar(@Valid @RequestBody Instituicao instituicao) {
		return instituicaoResository.save(instituicao);
	}

}
