package controller;

public class SaposThread extends Thread {

	private int puloMaximo;
	private int distanciaMaxima;

	public SaposThread(int puloMaximo, int distanciaMaxima) {

		this.puloMaximo = puloMaximo;
		this.distanciaMaxima = distanciaMaxima;
	}

	public void run() {

		corridaThread(puloMaximo, distanciaMaxima);

	}

	private void corridaThread(int puloMaximo, int distanciaMaxima) {
		
			
		while (distanciaMaxima > 0) {

			int pulo = (int) (Math.random() * (puloMaximo + 1));
			distanciaMaxima = distanciaMaxima - pulo;

			System.out.println("O sapo: " + getId() + " percorreu " + pulo + " metros");
		}
		
		
		
			
			System.out.println("O sapo: "  + " chegou em: " +(i+1)+ "º lugar\n");	
		}
		

	}

}
