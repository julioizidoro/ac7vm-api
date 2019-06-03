package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Obrafase;





public interface ObraFaseRepository extends JpaRepository<Obrafase, Integer>{
	
	Optional<List<Obrafase>> findByDescricaoContainingOrderByDescricao(String descrica);
	Optional<List<Obrafase>> findByContaContainingOrderByDescricao(String conta);
	Optional<Obrafase> findById(int id);
	List<Obrafase> findAll();

}
