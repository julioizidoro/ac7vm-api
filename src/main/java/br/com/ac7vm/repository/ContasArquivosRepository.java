package br.com.ac7vm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Contasarquivos;

public interface ContasArquivosRepository extends JpaRepository<Contasarquivos, Integer>{
	
	Optional<Contasarquivos> findById(int id);

}
