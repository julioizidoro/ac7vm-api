package br.com.ac7vm.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.ac7vm.model.Bens;

public interface BensRepository extends JpaRepository<Bens, Integer>{
	
	@Query("Select b from Bens b where ( b.datasaida<= :data or b.datasaida=NULL ) order by b.dataentrada")
	Optional<List<Bens>> findAllBens(@Param("data") Date data);
	
	@Query("Select b from Bens b where ( b.datasaida<= :data or b.datasaida=NULL ) and b.planoconta.idplanoconta= :idplanoconta order by b.dataentrada")
	Optional<List<Bens>> findAllBensPlanoContas(@Param("idplanoconta") int idplanoconta);
	
	@Query("Select b from Bens b where b.descricao like CONCAT('%', :descricao, '%')  order by b.dataentrada")
	Optional<List<Bens>> findAllBensDescricao(@Param("descricao") String descricao);

	Optional<Bens> findById(int id);
}
