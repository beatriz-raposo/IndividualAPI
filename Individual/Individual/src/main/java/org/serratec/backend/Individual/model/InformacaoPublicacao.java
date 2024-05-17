package org.serratec.backend.Individual.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class InformacaoPublicacao {
	
	private String dataPublicacao;
	private String autor;
	private String editora;
	
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	

}
