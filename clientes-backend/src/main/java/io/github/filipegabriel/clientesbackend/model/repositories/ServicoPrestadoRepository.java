package io.github.filipegabriel.clientesbackend.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.github.filipegabriel.clientesbackend.model.entities.ServicoPrestado;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer>{
	
	@Query(" SELECT s FROM ServicoPrestado s JOIN s.cliente c WHERE UPPER( c.nome ) LIKE UPPER( :nome ) AND MONTH( s.data ) = :mes ")
	List<ServicoPrestado> findByClienteAndMes(@Param("nome") String nome, @Param("mes") Integer mes);

}
