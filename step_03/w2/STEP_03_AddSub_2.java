import java.io.*;
class AddSub_2 {

	int total;

	AddSub_2(int total) {
		this.total = 0;
	}
	class Add {
		int total; // add_total

		Add(int total) {
			this.total = total;
		}
		int add2c(int a, int b) {
			int	s = a + b;

			AddSub_2.this.total += s;
			total += s;
			return (s);
		}
	}
	class Sub {
		int total; // sub_total

		Sub(int total) {
			this.total = total;
		}
		int sub2c(int a, int b) {
			int	s = a - b;
			
			AddSub_2.this.total -= s;
			total -= s;
			return (s);
		}
	}
}

class STEP_03_AddSub_2 {
	public static void main(String args[]) throws IOException {
		AddSub_2	addsub;
		AddSub_2.Add add;
		AddSub_2.Sub sub;
		int i, j, k, m, n;
		i = System.in.read() - '0';
		j = System.in.read() - '0';
		addsub = new AddSub_2(0);
		add = addsub.new Add(0);
		sub = addsub.new Sub(0);
		k = add.add2c(i, j);
		m = sub.sub2c(i, j);
		n = addsub.total;
		System.out.printf("%d + %d = %d(%d)\n", i, j, k, m);
	}
} 					// STEP_03/w2/STEP_03_AddSub_2.java



