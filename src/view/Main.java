package view;

import controller.MatrizThread;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				matriz[i][j] = (int) ((Math.random() * 10) + 1);
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.print("\n");
		}

		System.out.println("\n");

		for (int i = 0; i < 3; i++) {

			Thread matrizThread = new MatrizThread(matriz, i);
			matrizThread.start();
		}
	}

}
