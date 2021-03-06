package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Grupoplanoconta;

public interface GrupoPlanoContaRepository extends JpaRepository<Grupoplanoconta, Integer>{
	
	Optional<List<Grupoplanoconta>> findByDescricaoContainingOrderByDescricao(String Descricao);
	Optional<List<Grupoplanoconta>> findByContaContainingOrderByDescricao(String Conta);
	Optional<Grupoplanoconta> findById(int id);
	List<Grupoplanoconta> findAll();

}