package br.com.ac7vm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List<Cliente> findByNomeContainingOrderByNome(String Nome);
	List<Cliente> findAllOrderByNome(String Nome);
	
}
