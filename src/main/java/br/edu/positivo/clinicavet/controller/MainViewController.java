package br.edu.positivo.clinicavet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.edu.positivo.clinicavet.model.Animal;
import br.edu.positivo.clinicavet.model.AnimalDAO;
import br.edu.positivo.clinicavet.view.MainView;

public class MainViewController {
	private MainView view;
	private AnimalDAO dao = new AnimalDAO();
	
	public MainViewController(MainView view) {
		this.view = view;
		this.view.addBtnAnimaisListener(new BtnAnimaisListener());
		this.view.addBtnVoltarListener(new BtnVoltarListener());

	}

	private class BtnAnimaisListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				view.exibirTelaAnimais( dao.listar());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class BtnVoltarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.exibirTelaInicial();
		}
	}

	
}
