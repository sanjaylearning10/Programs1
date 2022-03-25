package durgaMuliThreading;

public class ThreadR1 {

	public static void main(String[] args) {

		ThreadRC1 objectRC1 = new ThreadRC1 ();
		Thread threadObject = new Thread(objectRC1);
		
		ThreadRC1 objectRC2 = new ThreadRC1 ();
		Thread threadObject1 = new Thread(objectRC2);
		
		threadObject.start();
		System.out.println("Number of Active thread "+threadObject.activeCount());

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thead");
		}

	}

}

class ThreadRC1 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thead");
		}
	}
}