package durgaMuliThreading;

public class Thread6 {

	public static void main(String[] args) {

		ThreadC6 objectC1 = new ThreadC6();
		objectC1.start();
		
		System.out.println("Number of Active thread "+objectC1.activeCount());	
		System.out.println("Main Thread");

	}

}

class ThreadC6 extends Thread {

	public void run() {
		
			System.out.println("Run Method");
		
	}
	
	public void start( ) {
		
			System.out.println("Start Method ");
		
	}
}