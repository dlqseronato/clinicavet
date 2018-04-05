package br.edu.positivo.clinicavet.clinicavet;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.positivo.clinicavet.controller.MainViewController;
import br.edu.positivo.clinicavet.view.MainView;

@SpringBootApplication
public class ClinicavetApplication {

	public static void main(String[] args) {
		 MainView view = new MainView();
		 MainViewController controller = new MainViewController(view);
		 view.setVisible(true);
	}
}
