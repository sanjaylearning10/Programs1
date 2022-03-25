package durgaMuliThreading;

public class Thread2 {

	public static void main(String[] args) {

		ThreadC2 objectC1 = new ThreadC2();
		//objectC1.start();
		objectC1.run();
		
		System.out.println("Number of Active thread "+objectC1.activeCount());

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thead");
		}

	}

}

class ThreadC2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thead");
		}
	}
}