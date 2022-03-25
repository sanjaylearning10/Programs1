package durgaMuliThreading;

public class Thread4 {

	public static void main(String[] args) {

		ThreadC4 objectC1 = new ThreadC4();
		objectC1.start();
		objectC1.run(3);
		System.out.println("Number of Active thread "+objectC1.activeCount());	

	}

}

class ThreadC4 extends Thread {

	public void run() {
		
			System.out.println("No Arg Method");
		
	}
	
	public void run(int i) {
		
			System.out.println("Int Argument Method ");
		
	}
}