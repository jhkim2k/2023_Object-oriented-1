import java.io.*;

import kor.ptln.*;

class STEP_07_PointLine_5 {
	public static void main(String args[]) throws IOException {
		Line_5		line;
		int		x, y, a, b;
		double	dl;

		x = System.in.read() - '0';
		y = System.in.read() - '0';
		a = System.in.read() - '0';
		b = System.in.read() - '0';
		
		line = new Line_5(x, y, a, b);

		dl = line.get_dl();
		System.out.printf("dl=%f\n", dl);
	}
}						// STEP_07/w5/STEP_07_PointLine_5.java