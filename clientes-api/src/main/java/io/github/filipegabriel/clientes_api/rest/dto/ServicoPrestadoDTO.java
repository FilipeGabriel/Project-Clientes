package io.github.filipegabriel.clientes_api.rest.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
	private String preco;
	
	@NotEmpty
	private String data;
	
	@NotNull
	private Integer idCliente;
	
}
