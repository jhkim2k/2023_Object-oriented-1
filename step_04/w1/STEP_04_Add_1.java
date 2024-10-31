import java.io.*;

class STEP_04_Add_1 {
	public static void main(String args[]) throws IOException {
		Add_1 add;
		int x, y, z;
		float a, b, c;

		x = System.in.read() - '0'; a = x;
		y = System.in.read() - '0'; b = y;
		add = new Add_1();
		z = add.add2c(x, y);
		c = add.add2c(a, b);
		System.out.printf("%d + %d = %d(%f)\n", x, y, z, c);
	}
}

class Add_1 {
	int total;
	int add2c(int a, int b) {
		int	s;
		s = a + b;
		total += s;
		return (s);
	}

	float add2c(float a, float b) {
		float	s;
		s = a + b;
		total += s;
		return (s);
	}
}				// STEP_04/w1/STEP_04_Add_1.java



