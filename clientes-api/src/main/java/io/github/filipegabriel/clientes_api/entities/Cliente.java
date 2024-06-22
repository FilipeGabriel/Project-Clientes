package io.github.filipegabriel.clientes_api.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data		//Cria os construtores com e sem parametros, getters e setters, hashcode e equals, to string
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	@NotNull
	@NotEmpty
	private String nome;
	
	@Column(nullable = false, length = 11)
	@NotNull
	@NotEmpty
	private String cpf;
	
	@Column(name = "data_cadastro", updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro;
	
	@PrePersist			//Antes da entidade Cliente persistir no banco de dados
	public void prePersist() {
		setDataCadastro(LocalDate.now());
	}
	
}
