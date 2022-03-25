package durgaMuliThreading;

public class Thread3 {

	public static void main(String[] args) {

		ThreadC3 objectC1 = new ThreadC3();
		objectC1.start();
		System.out.println("Number of Active thread "+objectC1.activeCount());	

	}

}

class ThreadC3 extends Thread {

	public void run() {
		
			System.out.println("No Arg Method");
		
	}
	
	public void run(int i) {
		
			System.out.println("Int Argument Method ");
		
	}
}