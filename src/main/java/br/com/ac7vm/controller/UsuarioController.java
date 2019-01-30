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
import org.springframework.web.server.ResponseStatusException;

import br.com.ac7vm.model.Usuario;
import br.com.ac7vm.repository.UsuarioRepository;
import br.com.ac7vm.util.Criptografia;

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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario salvar(@Valid @RequestBody Usuario usuario) {
		Criptografia criptografia = new Criptografia();
		usuario.setSenha(criptografia.encript(usuario.getSenha()));
		return usuarioRepository.save(usuario);
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
		Criptografia criptografia = new Criptografia();
		senha = (criptografia.encript(senha));
		Optional<Usuario> usuario = usuarioRepository.findByLoginAndSenha(login, senha);
		
		if (usuario==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario.get());
	}
	
	@GetMapping("buscarnome/{nome}")
	public ResponseEntity<Optional<List<Usuario>>> buscarNome(@PathVariable("nome") String nome) {
		Optional<List<Usuario>> usuario = usuarioRepository.findByNomeContainingOrderByNome(nome);
		
		if (usuario==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuario);
	}

}
