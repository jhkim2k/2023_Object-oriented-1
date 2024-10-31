class Counter implements Runnable {
	int 	total = 0, from, to;

	Counter(int from, int to) { this.from = from; this.to = to; }

	public void run() {
		for (int i = from; i < to; i++) {
			total += i;
		}
	}
	int get_total() { return(total); }
}

public class STEP_16_Thread_5 {
	public static void main(String[] args) {
		Counter cn1, cn2, cn3, cn4;

		cn1 = new Counter( 1, 25);	cn2 = new Counter(26, 50);
		cn3 = new Counter(51, 75);	cn4 = new Counter(76, 100);

		Thread th1, th2, th3, th4;

		th1 = new Thread(cn1);	th2 = new Thread(cn2);
		th3 = new Thread(cn3);	th4 = new Thread(cn4);

		th1.start(); th2.start(); th3.start(); th4.start();

		try {
			th1.join(); th2.join(); th3.join(); th4.join();
		} catch (InterruptedException e) {
		}
		int Total = cn1.get_total() + cn2.get_total() + 
						cn3.get_total() + cn4.get_total();

		System.out.println("Total=" + Total);
		System.out.println("Console thread is going out !!!");
		System.exit(0);
	}
}						// STEP_16/w5/STEP_16_Thread_5.java


