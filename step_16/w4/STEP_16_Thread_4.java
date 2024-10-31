class Thread_1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(0);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
	}
}

class Thread_2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}

class Thread_3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(2);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) { }
		}
	}
}

public class STEP_16_Thread_4 {
	public static void main(String[] args) {
		Thread_1 th1 = new Thread_1(); th1.start();
		Thread_2 th2 = new Thread_2(); th2.start();
		Thread_3 th3 = new Thread_3(); th3.start();
		System.out.println("Console thread is going out !!!");
	}
}						// STEP_16/w4/STEP_16_Thread_4.java


