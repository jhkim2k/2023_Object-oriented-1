import java.io.*;
/*****
class Add_41 {
	int add2i(int a, int b) {
		int	total;
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
}
class Add_42 {
	int add2i(int a, int b) {
		static int	total;
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
}
*****/
class Add_43 {
	int total;
	int add2i(int a, int b) {
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
}
class STEP_01_Add_4 {
	public static void main(String args[]) throws IOException {
		Add_43 add;
		int x, y, z, t;
		
		x = System.in.read() - '0';
		y = System.in.read() - '0';
		add = new Add_43();
		z = add.add2i(x, y);
		z = add.add2i(x, y);
		t = add.total;
		System.out.printf("%d + %d = %d, total = %d\n", x, y, z, t);
	}

} 					// STEP_01/w4/STEP_01_Add_4.java



