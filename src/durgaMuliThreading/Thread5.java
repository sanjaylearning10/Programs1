package durgaMuliThreading;

public class Thread5 {

	public static void main(String[] args) {

		ThreadC5 objectC1 = new ThreadC5();
		objectC1.start();
		
		System.out.println("Number of Active thread "+objectC1.activeCount());	

	}

}

class ThreadC5 extends Thread {

	
}