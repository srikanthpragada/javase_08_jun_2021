package advanced;

class Task implements Runnable {
	public void run() {
		System.out.println("In run() of Task");
	}
}

public class LambdaDemo {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// Method 1 - Using a class that implements Runnable 
		Thread t1 = new Thread(new Task()); // Thread(Runnable)
		t1.start();
		
		// Method 2 -  Using anonymous inner class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Anonymous inner class thread!");
			}
		});

		t2.start();

		// Method 3 - Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Thread with Lambda!"));
		t3.start();

		// Method 4 -  Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t4.start();

		// Thread t5 = new Thread(() -> printNumbers());

		// Method 5 - Method Reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);  // void run()
		t5.start();

	}

}
