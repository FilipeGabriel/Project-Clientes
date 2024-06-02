package io.github.filipegabriel.clientesbackend.model.entities;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.danielfariati.annotation.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 		//Cria os construtores com e sem parametros, getters e setters, hashcode e equals, to string
@NoArgsConstructor
@AllArgsConstructor
public class Cliente{
	
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
	@CPF
	private String cpf;
	
	@Column(name = "data_cadastro", updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro;
	
	@PrePersist			//Antes da entidade Cliente persistir no banco de dados
	public void prePersist() {
		setDataCadastro(LocalDate.now());
	}
	
}
