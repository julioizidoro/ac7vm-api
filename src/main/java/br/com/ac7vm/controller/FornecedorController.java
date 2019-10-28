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
import br.com.ac7vm.repository.FornecedorRepository;


@CrossOrigin
@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {
	
	@Autowired
	private FornecedorRepository fornecedorResository;
	
	@GetMapping("listar/tipo/{tipo}")
	public ResponseEntity<Optional<List<Instituicao>>> listar(@PathVariable("tipo") String tipo) {
		Optional<List<Instituicao>> lista = fornecedorResository.findByTipoOrderByNome(tipo);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("listar/{nome}/{email}")
	public ResponseEntity<Optional<List<Instituicao>>> listar(@PathVariable("nome") String nome, @PathVariable("email") String email) {
		Optional<List<Instituicao>> lista = fornecedorResository.findByTipoAndNomeContainingOrEmailContainingOrderByNome("f", nome, email);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("listar/{nome}")
	public ResponseEntity<Optional<List<Instituicao>>> listarNome(@PathVariable("nome") String nome) {
		Optional<List<Instituicao>> lista = fornecedorResository.findByTipoAndNomeContainingOrderByNome("f", nome);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<Instituicao>> listar(@PathVariable("id") int id) {
		Optional<Instituicao> instituicao = fornecedorResository.findById(id);
		if (instituicao==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(instituicao);
	}
	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	//@CachePut(value="consultaAsoControle", key="#asoControle.idasocontrole")
	public Instituicao salvar(@Valid @RequestBody Instituicao instituicao) {
			if (instituicao.getClientecomplemento()!=null) {
			instituicao.getClientecomplemento().setInstituicao(instituicao);
		}
		if (instituicao.getClienteenderecocomercial()!=null) {
			instituicao.getClienteenderecocomercial().setInstituicao(instituicao);
		}
		if (instituicao.getClienteenderecoresidencial()!=null) {
			instituicao.getClienteenderecoresidencial().setInstituicao(instituicao);
		}
		if (instituicao.getClientesegundo()!=null) {
			instituicao.getClientesegundo().setInstituicao(instituicao);;
		}
		if (instituicao.getClientesocio()!=null) {
			instituicao.getClientesocio().setInstituicao(instituicao);
		}
		return fornecedorResository.save(instituicao);
	}

}
