import java.io.*;
class Add_51 {
	int total;
	int add2i(int a, int b) {
		int	s;
		s = a + b;
		total +=s;
		return (s);
	}
}
class Add_52 {
	static int total;
	int add2i(int a, int b) {
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
}
/***
class Add_53 {
	int total;
	static int add2i(int a, int b) {
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
}
***/
class STEP_01_Add_5 {
	public static void main(String args[]) throws IOException {
		Add_51 add1, add2; // cf. Add_52
		int x, y, z, t;
		x = System.in.read() - '0';
		y = System.in.read() - '0';
		add1 = new Add_51();
		add2 = new Add_51();
		z = add1.add2i(x, y);
		z = add2.add2i(x, y);
		System.out.printf("%d + %d = %d, total1 = %d, total2 = %d\n", 
									x, y, z, add1.total, add2.total);
	}

} 					// STEP_01/w5/STEP_01_Add_5.java



