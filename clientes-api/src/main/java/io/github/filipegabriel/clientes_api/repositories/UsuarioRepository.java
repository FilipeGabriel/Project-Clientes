package io.github.filipegabriel.clientes_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.filipegabriel.clientes_api.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsername(String username);
	
}
