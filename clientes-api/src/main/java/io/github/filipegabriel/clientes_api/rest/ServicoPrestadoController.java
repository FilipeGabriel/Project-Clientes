package io.github.filipegabriel.clientes_api.rest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.filipegabriel.clientes_api.entities.Cliente;
import io.github.filipegabriel.clientes_api.entities.ServicoPrestado;
import io.github.filipegabriel.clientes_api.repositories.ClienteRepository;
import io.github.filipegabriel.clientes_api.repositories.ServicoPrestadoRepository;
import io.github.filipegabriel.clientes_api.rest.dto.ServicoPrestadoDTO;
import io.github.filipegabriel.clientes_api.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value= "/api/servicos-prestados")
@RequiredArgsConstructor
public class ServicoPrestadoController {
	
	private final ClienteRepository clienteRepository;
	private final ServicoPrestadoRepository servicoPrestadoRepository;
	private final BigDecimalConverter bigDecimalConverter;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ServicoPrestado salvar(@RequestBody ServicoPrestadoDTO dto) {
		LocalDate data = LocalDate.parse(dto.getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Cliente cliente = clienteRepository.findById(dto.getIdCliente()).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cliente inexistente."));
		
		ServicoPrestado servicoPrestado = new ServicoPrestado();
		servicoPrestado.setDescricao(dto.getDescricao());
		servicoPrestado.setData(data);
		servicoPrestado.setCliente(cliente);
		servicoPrestado.setValor(bigDecimalConverter.converter(dto.getPreco()));
		return servicoPrestadoRepository.save(servicoPrestado);
	}
	
	@GetMapping
	public List<ServicoPrestado> pesquisar(
			@RequestParam(value="nome", required=false, defaultValue="") String nome, 
			@RequestParam(value="mes", required=false) Integer mes
	){
		return servicoPrestadoRepository.findByClienteAndMes("%" + nome + "%", mes);
	}
	
}
