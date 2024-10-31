import java.io.*;
class Polygon_2 {
	int nPolygon;

	class Triangle {
		int tri(int height, int width) {
			int	s = (height * width)/2;
			nPolygon ++;
			return (s);
		}
	}
	class Rectangle {
		int rec(int height, int width) {
			int	s = height * width;
			nPolygon ++;
			return (s);
		}
	}
}

class STEP_03_Polygon_2 {
	public static void main(String[] args) throws IOException {		
		Polygon_2		polygon;
		Polygon_2.Triangle	pol1;
		Polygon_2.Rectangle	pol2;

		int i, j, t;
		int k, z;
		int x, y;
		int a, b;

		System.out.printf("밑변과 높이를 입력하시오.\n");

		i = System.in.read() - '0'; x = i;
		j = System.in.read() - '0'; y = j;
		
		System.out.printf("임의의 수를 입력하시오.\n");
		a = System.in.read() - '0'; b = a;

		polygon = new Polygon_2();

		pol1 = polygon.new Triangle();
		pol2 = polygon.new Rectangle();
		k = pol1.tri(i, j);
		z = pol2.rec(x, y);
		
		t = polygon.nPolygon;

		System.out.printf("%d\n", t);
	}
} 					// STEP_03/w2/STEP_03_Polygon_2.java



