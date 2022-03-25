package durgaMuliThreading;

public class Thread7 {

	public static void main(String[] args) {

		ThreadC7 objectC1 = new ThreadC7();
		objectC1.start();
		
		System.out.println("Number of Active thread "+objectC1.activeCount());	
		System.out.println("Main Thread");

	}

}

class ThreadC7 extends Thread {

	public void run() {
		
		
		System.out.println("Run Method");
		
	}
	
	public void start( ) {
		
			super.start();	
			System.out.println("Start Method ");
		
	}
}