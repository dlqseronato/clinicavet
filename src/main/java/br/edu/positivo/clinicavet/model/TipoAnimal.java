package br.edu.positivo.clinicavet.model;

import java.util.List;

public class TipoAnimal {
	private String acronimo;
	private String nomeTipoAnimal;
	private String descricao;
	private List<Especie> especies;
	
	public TipoAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoAnimal(String acronimo, String nome_tipoAnimal, String descricao, List<Especie> especies) {
		super();
		this.acronimo = acronimo;
		this.nomeTipoAnimal = nome_tipoAnimal;
		this.descricao = descricao;
		this.especies = especies;
	}
	public String getAcronimo() {
		return acronimo;
	}
	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}
	public String getNome_tipoAnimal() {
		return nomeTipoAnimal;
	}
	public void setNome_tipoAnimal(String nome_tipoAnimal) {
		this.nomeTipoAnimal = nome_tipoAnimal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Especie> getEspecies() {
		return especies;
	}
	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}
	
}
