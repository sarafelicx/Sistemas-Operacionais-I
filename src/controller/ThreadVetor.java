package controller;

public class ThreadVetor extends Thread {

	private int valor;
	private int[] vetor;

	public ThreadVetor(int[] vetor, int valor) {
		this.valor = valor;
		this.vetor = vetor;
	}

	public void run() {

		threadVetor(vetor, valor);
	}

	private void threadVetor(int[] vetor, int valor) {

		if (valor % 2 == 0) {

			double inicio = System.nanoTime();

			for (int i = 0; i < vetor.length; i++) {

				System.out.print(+vetor[i] + " ");
			}
			System.out.println("\n");

			double fim = System.nanoTime();
			double tempo = (fim - inicio) / Math.pow(10, 9);
			System.out.println("\nTempo para percorrer o vetor do for: " + tempo +"\n");
		}

		else {

			double inicio = System.nanoTime();

			for (int valorVetor : vetor) {

				System.out.print(+valorVetor + " ");

			}
			System.out.println("\n");

			double fim = System.nanoTime();
			double tempo = (fim - inicio) / Math.pow(10, 9);
			System.out.println("\nTempo para percorrer o vetor do for each: " + tempo +"\n");
		}
	}

}
