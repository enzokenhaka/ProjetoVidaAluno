package com.VidaDeAluno360.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Meta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	private String categoria;
	
	private String prazo;
	
	private String progresso;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getProgresso() {
		return progresso;
	}

	public void setProgresso(String progresso) {
		this.progresso = progresso;
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