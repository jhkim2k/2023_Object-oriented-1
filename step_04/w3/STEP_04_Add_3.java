import java.io.*;
class STEP_04_Add_3 {
	public static void main(String args[]) throws IOException {
		Add_3 add;
		int x, y, z;
		float a, b, c;

		x = System.in.read() - '0'; a = x;
		y = System.in.read() - '0'; b = y;

		add = new Add_3();

		z = add.add2c(x, y);
		c = add.add2c(a, b);

		System.out.printf("%d + %d = %d(%f)\n", x, y, z, c);
	}
} 					// STEP_04/w3/STEP_04_Add_3.java



