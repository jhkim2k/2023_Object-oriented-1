import java.io.*;

class Point_2 {
	int	x;
	int	y;

	Point_2(int x, int y) {
		this.x = x; this.y = y; 
	}
	void	set_xy(int x, int y) {
		this.x = x;	this.y = y;
	}
	void	set_x(int x) { this.x = x; }
	void	set_y(int y) { this.y = y; }
	int	get_x() { return x; }
	int	get_y() { return y; }
}
class Line_2 extends Point_2 {
	int	a, b;

	Line_2(int x, int y, int a, int b) {
		super(x, y);
		this.a = a; this.b = b; 
	}
	void	set_ab(int a, int b) {
		this.a = a;	this.b = b;
	}
	void	set_a(int a) { this.a = a; }
	void	set_b(int b) { this.b = b; }
	int	get_a() { return a; }
	int	get_b() { return b; }
	
	double get_dl() {
		double dl;
		dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2) );
		return dl;
	}

	boolean equalTo(Line_2 ln) {
	if (ln.get_x() == x && ln.get_y() == y &&
					ln.get_a() == a && ln.get_b() == b)
		return(true);
	else	return(false);
	}

	static boolean compareTwo(Line_2 ln1, Line_2 ln2) {
	if (ln1.get_x() == ln2.get_x() && ln1.get_y() == ln2.get_y()
	 && ln1.get_a() == ln2.get_a() && ln1.get_b() == ln2.get_b())
		return(true);
	else	return(false);
	}
}
class STEP_06_PointLine_2 {
	public static void main(String args[]) throws IOException {
		int		x, y, a, b;
 
		x = System.in.read() - '0';
		y = System.in.read() - '0';
		a = System.in.read() - '0';
		b = System.in.read() - '0';
		
		Line_2 line1= new Line_2(x, y, a, b);
		Line_2 line2= new Line_2(a, b, x, y);
		
		double d1 = line1.get_dl();
		double d2 = line2.get_dl();

		boolean b1 = line1.equalTo(line2);
		boolean b2 = Line_2.compareTwo(line1, line2);

		System.out.printf("dl1=%f,dl2=%f,b1=%b,b2=%b\n",
									 d1, d2, b1, b2);
	}
}						// STEP_06/w2/STEP_06_PointLine_2.java





