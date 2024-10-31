import java.util.*;

class Random_5 {
	int seed;
	int rnum0, rnum1, rnum2;
	int max;	

	Random_5(int seed) {
		this.seed = seed;
		setRnums();
		setMax();
	}
	void setRnums() {
		Random rnd = new Random(seed);
		int x, y, z;
		x = rnd.nextInt(100);
		y = rnd.nextInt(100);
		z = rnd.nextInt(100);
		this.rnum0 = x;
		this.rnum1 = y;
		this.rnum2 = z;
	}
	void setMax() {
		max = 0;
		if(rnum0 >= max) {
			max = rnum0;
		}
		if(rnum1 >= max) {
			max = rnum1;
		}
		if(rnum2 >= max) {
			max = rnum2;
		}
	}
	int outRnums() {
		System.out.printf("%d, %d, %d\n", rnum0, rnum1, rnum2);
		return rnum0+rnum1+rnum2;
	}
	int getMax() {
		return max;
	}
}