package br.com.ac7vm.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ac7vm.model.Contas;
import br.com.ac7vm.repository.ContasRepository;
import br.com.ac7vm.repository.FluxoCaixaRepository;
import br.com.ac7vm.repository.FluxoContasRepository;
import br.com.ac7vm.util.Conversor;

public class ContasReceberBean {
	
	@Autowired
	private ContasRepository contasRepository;
	@Autowired
	private FluxoCaixaRepository fluxoCaixaRepository;
	@Autowired
	private FluxoContasRepository fluxoContasRepository;
	
	
	public void salvarReceber(Contas conta) {
		Conversor c = new Conversor();
		String data = c.ConvercaoDataPadrao(conta.getDatavencimento());
		String mes = data.substring(3, 5);
		String ano = data.substring(6, 10);
		String dia = data.substring(0, 2);
		int cmes = Integer.parseInt(mes);
		int cano = Integer.parseInt(ano);
		int numeroParcelas = conta.getNumeroparcela();
		Float valorParcela = 0.0f;
		Date cData  = conta.getDatavencimento();

	}
	

}
