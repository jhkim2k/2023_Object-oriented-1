import java.io.*;

class STEP_07_Add_2 {
	public static void main(String args[]) throws IOException {
		
		work.Add_2 add;

		int x, y, z;
		float a, b, c;
		x = System.in.read() - '0'; a = x;
		y = System.in.read() - '0'; b = y;

		add = new work.Add_2();

		z = add.add2c(x, y);
		c = add.add2c(a, b);
		System.out.printf("%d + %d = %d(%f)\n", x, y, z, c);
	}
} 					// STEP_07/w2/STEP_07_Add_2.java



