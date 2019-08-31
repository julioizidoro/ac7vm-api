package br.com.ac7vm.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.model.Fluxocaixa;
import br.com.ac7vm.repository.FluxoCaixaRepository;
import br.com.ac7vm.util.Conversor;

@CrossOrigin
@RestController	
@RequestMapping("/api/fluxocaixa")
public class FluxoCaixaController {
	
	@Autowired
	private FluxoCaixaRepository fluxoCaixaRepository;
	
	@GetMapping
	@Cacheable("consultaFluxoCaixa")
	public ResponseEntity<Optional<List<Fluxocaixa>>> listar() {
		Conversor c = new Conversor();
		Date datainicial = c.SomarDiasData(new Date(), -10);
		Date datafinal = c.SomarDiasData(new Date(), 10);	
		Optional<List<Fluxocaixa>> lista = fluxoCaixaRepository.findAllFluxoCaixa(datainicial, datafinal);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(lista);
	}
	

}
