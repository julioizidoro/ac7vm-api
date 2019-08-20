package br.com.ac7vm.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.ac7vm.model.Contas;


public interface ContasRepository extends JpaRepository<Contas, Integer>{
	
	Optional<Contas> findById(int id);
	
	@Query("Select c from Contas c where c.datavencimento<= :data and c.tipo= :tipo and datapagamento is NULL order by c.datavencimento")
	Optional<List<Contas>> findAllContas(@Param("data") Date data, @Param("tipo") String tipo);

}
