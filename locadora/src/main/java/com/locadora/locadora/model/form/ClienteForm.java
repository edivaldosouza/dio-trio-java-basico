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
public class ClienteForm {

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	  private String nome;

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  //@CPF(message = "'${validatedValue}' é inválido!")
	  @Column(unique = true)
	  private String cpf;
	  
	  @NotEmpty(message = "Preencha o campo corretamente.")
	  private String endereco;

	  @NotEmpty(message = "Preencha o campo corretamente.")
	  private String bairro;

	  @NotNull(message = "Prencha o campo corretamente.")
	  @Past(message = "Data '${validatedValue}' é inválida.")
	  private LocalDate dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	
}
