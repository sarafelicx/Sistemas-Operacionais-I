package view;

import controller.IdThread;

public class Main {

	public static void main(String[] args) {

	
		for (int idThread = 0; idThread < 5; idThread++) {
			
			Thread id = new IdThread(idThread);
			id.start();

		}
	}
}
