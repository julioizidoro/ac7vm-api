package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Fornecedor;



public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer>{
	
	Optional<List<Fornecedor>> findByNomeContainingOrderByNome(String Nome);
	Optional<Fornecedor> findById(int id);
	List<Fornecedor> findAll();

}