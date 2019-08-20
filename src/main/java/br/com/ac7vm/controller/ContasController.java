package br.com.ac7vm.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Contas;
import br.com.ac7vm.repository.ContasRepository;
import br.com.ac7vm.util.Conversor;

@CrossOrigin
@RestController	
@RequestMapping("/contas")
public class ContasController {
	
	@Autowired
	private ContasRepository contasRepository;
	
	@GetMapping("/{tipo}")
	@Cacheable("consultaContas")
	public ResponseEntity<Optional<List<Contas>>> listar(@PathVariable("tipo") String tipo) {
		Conversor c = new Conversor();
		Date data = c.SomarDiasData(new Date(), 90);
		Optional<List<Contas>> lista = contasRepository.findAllContas(data, tipo);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(lista);
	}

}
