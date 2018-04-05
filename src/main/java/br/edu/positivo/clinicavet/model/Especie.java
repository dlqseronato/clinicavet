package br.edu.positivo.clinicavet.model;

import java.util.List;

public class Especie {
	private int id;
	private String nomeEspecie;
	private String descricao;
	private List<Animal> animais;
	
	private TipoAnimal tipoAnimal;

	public Especie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Especie(int id, String nomeEspecie) {
		super();
		this.id = id;
		this.nomeEspecie = nomeEspecie;
	}


	public Especie(int id, String nome_especie, String descricao, List<Animal> animais, TipoAnimal tipo_Animal) {
		super();
		this.id = id;
		this.nomeEspecie = nome_especie;
		this.descricao = descricao;
		this.animais = animais;
		this.tipoAnimal = tipo_Animal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nome_especie) {
		this.nomeEspecie = nome_especie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public TipoAnimal getTipo_Animal() {
		return tipoAnimal;
	}

	public void setTipo_Animal(TipoAnimal tipo_Animal) {
		this.tipoAnimal = tipo_Animal;
	}

	
}
