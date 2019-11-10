package br.com.ac7vm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ac7vm.bean.FluxoCaixaBean;
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
	public ResponseEntity<List<Fluxocaixa>> listarData() {
		Conversor c = new Conversor();
		Date datainicial = c.SomarDiasData(new Date(), -1);
		Date datafinal = c.SomarDiasData(new Date(), 9);	
		List<Fluxocaixa> lista = fluxoCaixaRepository.findAllFluxoCaixaData(datainicial, datafinal);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		FluxoCaixaBean fluxoCaixaBean = new FluxoCaixaBean(lista, fluxoCaixaRepository);
		fluxoCaixaBean.calcularSaldos();
		lista = fluxoCaixaBean.getListaFluxo();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("listar")
	@Cacheable("consultaFluxoCaixa")
	public ResponseEntity<List<Fluxocaixa>> listarInicial() {
		Conversor c = new Conversor();
		Date datainicial = c.SomarDiasData(new Date(), -1);
		List<Fluxocaixa> lista = fluxoCaixaRepository.findAllFluxoCaixaInicial(datainicial);
		if (lista==null) {
			return ResponseEntity.notFound().build();
		}
		FluxoCaixaBean fluxoCaixaBean = new FluxoCaixaBean(lista, fluxoCaixaRepository);
		fluxoCaixaBean.calcularSaldos();
		lista = fluxoCaixaBean.getListaFluxo();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("data/{data}")
	public ResponseEntity<List<Fluxocaixa>> getId(@PathVariable("data") String data) {
		Conversor c = new Conversor();
		Date dataStart = c.ConvercaoStringData(data);
		List<Fluxocaixa> listaFluxoCaixa = fluxoCaixaRepository.findData(dataStart);
		if (listaFluxoCaixa==null) {
			return ResponseEntity.notFound().build();
		}
		FluxoCaixaBean fluxoCaixaBean = new FluxoCaixaBean(listaFluxoCaixa, fluxoCaixaRepository);
		fluxoCaixaBean.calcularSaldos();
		 listaFluxoCaixa = fluxoCaixaBean.getListaFluxo();
		return ResponseEntity.ok(listaFluxoCaixa);
	}
	
	
	
	

}
