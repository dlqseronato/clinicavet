package br.edu.positivo.clinicavet.controller;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.positivo.clinicavet.model.Animal;

public class AnimalsController  extends AbstractTableModel{
	private static final int NUM_COLUNAS_ANIMAL = 3;

	private List<Animal> animaisTabela;
	public AnimalsController() {
	}
	public AnimalsController(List<Animal> animais) {
		animaisTabela = animais;
	}
	public List<Animal> getAnimaisTabela() {
		return animaisTabela;
	}
	public void setAnimaisTabela(List<Animal> animaisTabela) {
		this.animaisTabela = animaisTabela;
	}

	@Override
	public String getColumnName(int posicao){
		switch (posicao) {
		case 0:
			return "Identificador";
		case 1:
			return "Nome do animal";
		case 2:
			return "Nascimento";	
		case 3:
			return "Espécie";
		default:
			throw new RuntimeException("Coluna inexistente para animal.");
		}
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return NUM_COLUNAS_ANIMAL;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if(animaisTabela!=null)
			return animaisTabela.size();
		else
			return 0;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return animaisTabela.get(rowIndex).getId();
		case 1:
			return animaisTabela.get(rowIndex).getNome();
		case 2:
			return animaisTabela.get(rowIndex).getNascimento();
		case 3:
			return animaisTabela.get(rowIndex).getEspecie().getNomeEspecie();

		default:
			throw new RuntimeException("Coluna inválida.");
		}
	}




}
