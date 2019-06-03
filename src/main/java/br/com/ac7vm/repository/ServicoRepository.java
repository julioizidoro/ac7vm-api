package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer>{
	
	Optional<List<Servico>> findByDescricaoContainingOrderByDescricao(String Descricao);
	Optional<Servico> findById(int id);
	Optional<List<Servico>> findByContaContainingOrderByDescricao(String conta);
	List<Servico> findAll();

}