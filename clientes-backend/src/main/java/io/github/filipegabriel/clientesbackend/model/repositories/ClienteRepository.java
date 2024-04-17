package io.github.filipegabriel.clientesbackend.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.filipegabriel.clientesbackend.model.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
