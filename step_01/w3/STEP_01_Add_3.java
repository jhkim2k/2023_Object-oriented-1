import java.io.*;
class Add_3 {
	int add2i(int a, int b) {
		int	s;
		s = a + b;
		return (s);
	}
}
class STEP_01_Add_3 {
	public static void main(String args[]) throws IOException {
		int x, y, z;
		Add_3 add;
		x = System.in.read() - '0';
		y = System.in.read() - '0';

		add = new Add_3();

		z = add.add2i(x, y);
		System.out.printf("%d + %d = %d\n", x, y, z);
	}

} 					// step_01/w3/STEP_01_Add_3.java