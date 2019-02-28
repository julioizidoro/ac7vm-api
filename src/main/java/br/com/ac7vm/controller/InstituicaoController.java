package br.com.ac7vm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Instituicao;
import br.com.ac7vm.repository.InstituicaoRepository;

@CrossOrigin("*")
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

}
