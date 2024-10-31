import java.io.*;
class Add_2 {
	int total;
	int add2i(int a, int b) {
		int	s;
		s = a + b;
		total += s;
		return (s);
	}
	float add2f(float a, float  b) {
		float	s;
		s = a + b;
		total += s;
		return (s);
	}
	int add2if(int a, float  b) {
		float	s;
		s = a + b;
		total += s;
		return ((int)s);
	}
	float add2fi(float a, int  b) {
		float	s;
		s = a + b;
		total += s;
		return (s);
	}
}
class STEP_02_Add_2 {
	public static void main(String args[]) throws IOException {
		Add_2 add;
		int i, j, k;
		float x, y, z;
		x = System.in.read() - '0'; i = (int)x;
		y = System.in.read() - '0'; j = (int)y;
		add = new Add_2();
		k = add.add2if(i, j);
		// z = add.add2if(x, y);
		System.out.printf("%d + %d = %d\n", i, j, k);
	}
} 					// STEP_02/w2/STEP_02_Add_2.java



