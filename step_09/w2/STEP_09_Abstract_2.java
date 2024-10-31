abstract class Measure {
	int	x;
	abstract double max();
	abstract double min();
	abstract double avg();
	void		    dmy() { return; }
}

class Temperature extends Measure {
	double[]		T_data;
	public double max() {

		double mx = T_data[0];
		for (int i = 1; i < T_data.length; i++)
			if (mx < T_data[i]) mx = T_data[i];

		return (mx);
	}
	public double min() {

		double mn = T_data[0];
		for (int i = 1; i < T_data.length; i++)
			if (mn < T_data[i]) mn = T_data[i];

		return (mn);
	}
	public double avg() {
		double sm;
		int i;

		for (i = 0, sm = 0; i < T_data.length; i++)
			sm = T_data[i];
		return (sm / i);
	}
}
class Humidity extends Measure {
	double H_data[];

	public double max() {
		double mx = H_data[0];
		for (int i = 1; i < H_data.length; i++)
			if (H_data[i] <= 100 && mx < H_data[i]) 
				mx = H_data[i];
		return (mx);
	}
	public double min() {
		double mn = H_data[0];
		for (int i = 1; i < H_data.length; i++)
			if (H_data[i] >= 0 && mn > H_data[i]) 
				mn = H_data[i];
		return (mn);
	}
	public double avg() {
		double sm = 0;
		int	 count = 0;
		for (int i = 0; i < H_data.length; i++) {
			if (0 <= H_data[i] && H_data[i] <= 100) {
				sm = H_data[i];
				count ++;
			}
		}
		return (sm / count);
	}
}						// STEP_09/w2/STEP_09_Abstract_2.java


