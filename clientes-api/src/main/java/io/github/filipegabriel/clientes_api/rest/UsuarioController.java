package io.github.filipegabriel.clientes_api.rest;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.filipegabriel.clientes_api.entities.Usuario;
import io.github.filipegabriel.clientes_api.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController implements UserDetailsService {
	
private final UsuarioRepository usuarioRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestBody @Valid Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	@GetMapping(value = "/{id}")
	public Usuario acharPorId(@PathVariable Integer id) {
		return usuarioRepository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping(value = "/search")
	public Usuario acharPorUsername(@RequestParam String username) {
		return usuarioRepository.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return usuarioRepository.findByUsername(username);
	}

}
