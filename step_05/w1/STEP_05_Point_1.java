import java.io.*;

class Point_1 {
	int	x;
	int	y;
}

class STEP_05_Point_1 {
	public static void main(String args[]) throws IOException {
		Point_1	pnt1, pnt2;
		int		x1, y1, x2, y2;
		double	dl;

		x1 = System.in.read() - '0';
		y1 = System.in.read() - '0';
		x2 = System.in.read() - '0';
		y2 = System.in.read() - '0';
		
		pnt1 = new Point_1();	pnt1.x = x1; pnt1.y = y1;
		pnt2 = new Point_1();	pnt2.x = x2; pnt2.y = y2;

		dl = Math.sqrt(Math.pow(pnt1.x - pnt2.x, 2) + 
							Math.pow(pnt1.y - pnt2.y, 2) );
		System.out.printf("dl=%f\n", dl);
	}
}						// STEP_05/w1/STEP_05_Point_1.java





