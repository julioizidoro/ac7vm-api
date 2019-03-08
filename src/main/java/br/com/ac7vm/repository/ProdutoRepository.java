package br.com.ac7vm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Produto;





public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	Optional<List<Produto>> findByDescricaoContainingOrderByDescricao(String Descricao);
	Optional<Produto> findById(int id);
	List<Produto> findAll();

}