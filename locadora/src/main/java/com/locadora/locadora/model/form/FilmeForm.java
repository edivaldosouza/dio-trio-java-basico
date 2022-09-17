package com.locadora.locadora.model.form;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FilmeForm {

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	  private String nome;

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  private String ano;
	  
	  @NotEmpty(message = "Preencha o campo corretamente.")
	  private String categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	 
	
}
