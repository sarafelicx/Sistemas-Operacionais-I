package controller;

public class MatrizThread extends Thread {

	private int[][] matriz;
	private int i;

	public MatrizThread(int matriz[][], int i) {

		this.matriz = matriz;
		this.i = i;
	}

	public void run() {

		somaMatriz(matriz, i);
	}

	private void somaMatriz(int[][] matriz, int i) {

		int[] somaVetor = new int[3];

		for (int j = 0; j < 5; j++) {

			somaVetor[i] += matriz[i][j];

		}

		System.out.println("Thread: " + i + " linha: " + i + " soma da linha: " + somaVetor[i]);

	}

}
