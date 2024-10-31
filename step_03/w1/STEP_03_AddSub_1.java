import java.io.*;
class AddSub_1 {
	int total;

	class Add {
		int add2c(int a, int b) {
			int	s = a + b;
			total += s;
			return (s);
		}
		float add2c(float a, float b) {
			float	s = a + b;
			total += s;
			return (s);
		}
	}
	class Sub {
		int sub2c(int a, int b) {
			int	s = a - b;
			total -= s;
			return (s);
		}
		float sub2c(float a, float b) {
			float	s = a - b;
			total -= s;
			return (s);
		}
	}
}

class STEP_03_AddSub_1 {
	public static void main(String args[]) throws IOException {
		AddSub_1 addsub;
		AddSub_1.Add add1, add2;
		AddSub_1.Sub sub1, sub2;
		int i, j, k, m;
		float x, y, z;
		i = System.in.read() - '0'; x = i;
		j = System.in.read() - '0'; y = j;

		addsub = new AddSub_1();

		add1 = addsub.new Add();
		add2 = addsub.new Add();
		sub1 = addsub.new Sub();
		sub2 = addsub.new Sub();

		k = add1.add2c(i, j);
		z = sub1.sub2c(x, y);
		m = addsub.total;
		System.out.printf("%d + %d = %d(%f, %d)\n", i, j, k, z, m);
	}
} 					// STEP_03/w1/STEP_03_AddSub_1.java



