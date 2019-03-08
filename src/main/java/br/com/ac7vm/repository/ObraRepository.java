package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Obra;



public interface ObraRepository extends JpaRepository<Obra, Integer>{
	
	Optional<List<Obra>> findByNomeContainingOrderByNome(String Nome);
	Optional<Obra> findById(int id);
	List<Obra> findAll();

}

