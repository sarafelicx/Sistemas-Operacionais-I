package controller;

public class IdThread extends Thread {

	int idThread;

	public IdThread(int idThread) {

		this.idThread = idThread;
	}

	public void run() {

		System.out.println("TID: " + getId());
	}

}
