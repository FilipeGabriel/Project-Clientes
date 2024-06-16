package io.github.filipegabriel.clientesbackend.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.filipegabriel.clientesbackend.model.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
