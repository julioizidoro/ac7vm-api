package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Planoconta;

public interface PlanoContaRepository extends JpaRepository<Planoconta, Integer>{
	
	Optional<List<Planoconta>> findByDescricaoContainingOrderByDescricao(String Descricao);
	Optional<Planoconta> findById(int id);
	List<Planoconta> findAll();

}