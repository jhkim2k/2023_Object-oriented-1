class MailBox {
	String mail = null, mymail;
	synchronized String get_mail() {
		try {
			while((mymail = mail) == null)
				wait();
		} catch (InterruptedException e) { }
		mail = null;
		notify();
		return(mymail);
	}
	synchronized void put_mail(String mail) {
		try {
			while((this.mail) != null)
				wait();
		} catch (InterruptedException e) { }
		this.mail = mail;
		notify();
	}
}

class Consumer extends Thread {
	MailBox	mbox;
	String	mail;

	Consumer(MailBox mbox) { this.mbox = mbox; }
	public void run() {
		while(true) {
			mail = mbox.get_mail();
			System.out.println(mail);
		}
	}
}

class Producer extends Thread {
	MailBox	mbox;
	String	mail;

	Producer (MailBox mbox) { this.mbox = mbox; }
	public void run() {
		for (int i = 0; i < 10; i++) {
			mail = "This is Mail_" + i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }

			mbox.put_mail(mail);
		}
	}
}

public class STEP_16_Thread_6 {
	public static void main(String[] args) {
		MailBox mbox = new MailBox();

		Consumer thc = new Consumer(mbox); thc.start();

		Producer thp = new Producer(mbox, "Kim"); thp.start();
		Producer thq = new Producer(mbox, "Park"); thq.start();

		try {
			thp.join(); thq.join();
		} catch (InterruptedException e) { }

		System.out.println("Console thread is going out !!!");
		System.exit(0);
	}
}						// STEP_16/w6/STEP_16_Thread_6.java


