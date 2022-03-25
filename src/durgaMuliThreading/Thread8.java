package durgaMuliThreading;

public class Thread8 {

	public static void main(String[] args) {

		ThreadC8 objectC1 = new ThreadC8();
		objectC1.start();
		objectC1.start();
		
		System.out.println("Number of Active thread "+objectC1.activeCount());	
		System.out.println("Main Thread");

	}

}

class ThreadC8 extends Thread {

	public void run() {
		
		
		System.out.println("Run Method");
		
	}
	
	public void start( ) {
		
			super.start();	
			System.out.println("Start Method ");
		
	}
}