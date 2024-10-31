package kor.ptln;

import kor.ptln.Point_5;

public class Line_5 extends Point_5 {

	int	a, b;

	public Line_5(int x, int y, int a, int b) {
		super(x, y);
		this.a = a; this.b = b; 
	}
	void	set_ab(int a, int b) { this.a = a; this.b = b; }
	void	set_a(int a) { this.a = a; }
	void	set_b(int b) { this.b = b; }
	int	get_a() { return a; }
	int	get_b() { return b; }

	public double get_dl() {
		double dl;
		dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2) );
		return (dl);
	}
}					// STEP_07/W5/kor/ptln/Line_5.java
