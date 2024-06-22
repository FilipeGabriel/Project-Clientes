package io.github.filipegabriel.clientes_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.filipegabriel.clientes_api.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
