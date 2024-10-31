import java.io.*;

class Point_1 {
	int	x;
	int	y;

	Point_1(int x, int y) {
		this.x = x; 
		this.y = y; 
	}
	void	set_xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void	set_x(int x) { this.x = x; }
	void	set_y(int y) { this.y = y; }
	int	get_x() { return x; }
	int	get_y() { return y; }
}
class Line_1 extends Point_1 {
	int	a, b;

	Line_1(int x, int y, int a, int b) {
		super(x, y);
		this.a = a; this.b = b; 
	}
	void	set_ab(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void	set_a(int a) { this.a = a; }
	void	set_b(int b) { this.b = b; }
	int	get_a() { return a; }
	int	get_b() { return b; }
}
class STEP_06_PointLine_1 {
	public static void main(String args[]) throws IOException {
		Line_1	line;
		int		x, y, a, b;
		double	dl;

		x = System.in.read() - '0';
		y = System.in.read() - '0';
		a = System.in.read() - '0';
		b = System.in.read() - '0';
		
		line = new Line_1(x, y, a, b);

		dl = Math.sqrt(Math.pow(line.get_x() - line.get_a(), 2) + 
					Math.pow(line.get_y() - line.get_b(), 2) );

		System.out.printf("dl=%f\n", dl);
	}
}						// STEP_06/w1/STEP_06_PointLine_1.java





