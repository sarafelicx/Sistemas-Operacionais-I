package view;

import javax.swing.JOptionPane;

import controller.SaposThread;

public class Main {

	public static void main(String[] args) {

		int puloMaximo = Integer.parseInt(JOptionPane.showInputDialog("Digite o pulo máximo do sapo em metros: "));
		int distanciaMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância total da corrida em metros: "));
				
		for (int i = 1; i < 6; i++) {

			Thread threadSapo = new SaposThread(puloMaximo, distanciaMaxima);
			threadSapo.start();

		}
	}
}
