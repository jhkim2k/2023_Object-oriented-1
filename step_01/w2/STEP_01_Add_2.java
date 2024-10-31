import java.io.*;
class Add_2 {
	static int add2i(int a, int b) {
		int	s;

		s = a + b;
		return (s);
	}
}
class STEP_01_Add_2 {
	public static void main(String args[]) throws IOException {
		int x, y, z;

		x = System.in.read() - '0';
		y = System.in.read() - '0';
		z = Add_2.add2i(x, y);

		System.out.printf("%d + %d = %d\n", x, y, z);
	}

} 					// step_01/w2/STEP_01_Add_2.java