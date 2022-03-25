package durgaMuliThreading;

public class Thread1 {

	public static void main(String[] args) {

		ThreadC1 objectC1 = new ThreadC1();
		objectC1.start();
		System.out.println("Number of Active thread "+objectC1.activeCount());

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thead");
		}

	}

}

class ThreadC1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thead");
		}
	}
}