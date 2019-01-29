package br.com.ac7vm.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Usuario;
import br.com.ac7vm.repository.UsuarioRepository;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public Usuario usuario() {
		Usuario usuario = new Usuario();
		usuario.setIdusuario(1);
		usuario.setNome("Julio Izidoro");
		return usuario;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable Integer id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		if (usuario==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario.get());
	}
	
	@GetMapping("/{login}/{senha}")
	public ResponseEntity<Usuario> buscar(@PathVariable("login") String login, @PathVariable("senha") String senha) {
		Optional<Usuario> usuario = usuarioRepository.findByLoginAndSenha(login, senha);
		
		if (usuario==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario.get());
	}

}
