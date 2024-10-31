import java.io.*;
class Input {
	public static void main(String args[]) throws IOException {
		int x, y, z;
		
		x = System.in.read();
		y = System.in.read();
		z = (x - '0') + (y - '0');
		System.out.printf("x=%c, %d(%x), y=%c, %d(%x)\n", x,x,x,y,y,y);
		System.out.printf("%c + %c = %d\n", x, y, z);
	}
} 					// step_00/w3/Input.java