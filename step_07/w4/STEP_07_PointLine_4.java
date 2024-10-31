import java.io.*;

class STEP_07_PointLine_4 {
	public static void main(String args[]) throws IOException {
		kor.ptln.Line_4		line;
		int		x, y, a, b;
		double	dl;

		x = System.in.read() - '0';
		y = System.in.read() - '0';
		a = System.in.read() - '0';
		b = System.in.read() - '0';
		
		line = new kor.ptln.Line_4(x, y, a, b);

		dl = line.get_dl();
		System.out.printf("dl=%f\n", dl);
	}
}						// STEP_07/w4/STEP_07_PointLine_4.java