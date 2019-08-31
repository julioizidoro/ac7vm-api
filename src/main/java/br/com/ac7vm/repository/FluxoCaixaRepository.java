package br.com.ac7vm.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.ac7vm.model.Fluxocaixa;

public interface FluxoCaixaRepository extends JpaRepository<Fluxocaixa, Integer>{
	
	@Query("Select f from Fluxocaixa f where f.data>= :datainicial and f.data<= :datafinal order by f.data")
	Optional<List<Fluxocaixa>> findAllFluxoCaixa(@Param("datainicial") Date datainicial, @Param("datafinal") Date datafinal);
	
	@Query("Select f from Fluxocaixa f where f.data= :data")
	Fluxocaixa findFluxoCaixa(@Param("data") Date datainicial);

}
