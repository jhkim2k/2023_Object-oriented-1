import java.io.*;
class STEP_01_add_1 {
	public static void main(String args[]) throws IOException {
		int x, y, z;
		x = System.in.read() - '0';
		y = System.in.read() - '0';
		z = add2i(x, y);
		System.out.printf("%d + %d = %d\n", x, y, z);
	}
	static int add2i(int a, int b) {
		int	s;
		s = a + b;
		return (s);
	}
} 					// step_01/w1/STEP_01_add_1.java