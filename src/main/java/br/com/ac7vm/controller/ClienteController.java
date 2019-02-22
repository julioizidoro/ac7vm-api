package br.com.ac7vm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Cliente;
import br.com.ac7vm.repository.ClienteRepository;

@CrossOrigin
@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> clientes  = clienteRepository.findAllOrderByNome(" ");
		if (clientes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping("buscarnome/{nome}")
	public ResponseEntity<List<Cliente>> listar(@PathVariable("nome") String nome){
		List<Cliente> clientes  = clienteRepository.findByNomeContainingOrderByNome(nome);
		if (clientes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(clientes);
	}

}
