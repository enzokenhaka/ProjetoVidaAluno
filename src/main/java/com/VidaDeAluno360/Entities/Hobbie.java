package com.VidaDeAluno360.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Hobbie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String categoria;
	
	private String plataforma;
	
	private String tempoSemanal;
	
	private String nivelHabilidade;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getTempoSemanal() {
		return tempoSemanal;
	}

	public void setTempoSemanal(String tempoSemanal) {
		this.tempoSemanal = tempoSemanal;
	}

	public String getNivelHabilidade() {
		return nivelHabilidade;
	}

	public void setNivelHabilidade(String nivelHabilidade) {
		this.nivelHabilidade = nivelHabilidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//Acho que no meu computador tem algo de errado com o Lombok, precisei criar os Getters e Setter
	//pra não ficar dando erro no Service, e no Controller por conseguinte
}