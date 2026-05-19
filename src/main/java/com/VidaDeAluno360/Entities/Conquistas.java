package com.VidaDeAluno360.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Conquistas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	private String dataConquista;
	
	private String categoria;
	
	private String pontuacao;
	
	private String nivel;

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

	public String getDataConquista() {
		return dataConquista;
	}

	public void setDataConquista(String dataConquista) {
		this.dataConquista = dataConquista;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	//Acho que no meu computador tem algo de errado com o Lombok, precisei criar os Getters e Setter
	//pra não ficar dando erro no Service, e no Controller por conseguinte
	
}