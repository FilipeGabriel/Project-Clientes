package io.github.filipegabriel.clientesbackend.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.filipegabriel.clientesbackend.model.entities.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
