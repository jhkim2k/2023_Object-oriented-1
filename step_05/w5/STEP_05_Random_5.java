import java.io.*;

class STEP_05_Random_5 {
	public static void main(String args[]) throws IOException {
	
	Random_5 r5, r7;
	
	r5 = new Random_5(5);
	r7 = new Random_5(7);
	
	System.out.printf("rsum = %d\n", r5.outRnums());
	System.out.printf("rmax = %d\n\n", r5.getMax());
	System.out.printf("rsum = %d\n", r7.outRnums());
	System.out.printf("rmax = %d\n", r7.getMax());
	}
}