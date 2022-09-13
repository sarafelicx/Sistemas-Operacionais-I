package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {

		int[] vetor = new int[1000];
		int tamanhoVetor = vetor.length;

		for (int i = 0; i < tamanhoVetor; i++) {

			vetor[i] = (int) ((Math.random() * 101) + 1);
		}

		for (int valor = 1; valor < 3; valor++) {

			Thread threadVetor = new ThreadVetor(vetor, valor);
			threadVetor.start();
		}

	}
}
