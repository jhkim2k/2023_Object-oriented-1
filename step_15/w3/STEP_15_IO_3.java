import java.io.*;

class IO_31 {
	void io_test() {
		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.err.println(
					"Can't open 'data.bin' for output...");
			System.exit(1);
		}
		System.out.println("IO_31...");

		try {
			//char		ch1 = 'A', ch2 = 0x42, ch3 = 'C';
			//char[]	chs = {'X', 'Y', 'Z'};
			int	ch;

			for(ch='A'; ch<='Z'; ch++) {
				fw.write(ch);
			}
			
			//fw.write(ch1); fw.write(ch2); fw.write(ch3);
			//fw.write(chs, 0, 3);

			fw.close();

		} catch(IOException e) {
			System.err.println("Character write error...");
			System.exit(2);
		}
	}
}

class IO_32 {
	void io_test() {
		FileReader fr = null;

		try {
			fr = new FileReader("data.txt");
		} catch (IOException e) {
			System.err.println(
					"Can't open 'data.txt' for output...");
			System.exit(1);
		}
		System.out.println("IO_32...");

		try {
			int		ch1, ch2, ch3, n;
			char[]	chs = new char[3];
			int ch;

			//ch1 = fr.read(); ch2 = fr.read(); ch3 = fr.read();

			while(true) {
				ch = fr.read();
				if (ch<0)
					break;
				System.out.printf("%c ", ch);
			}

			n = fr.read(chs, 0, 3);

			//System.out.printf("%c %c %c %c %c %c\n", 
			//		ch1, ch2, ch3, chs[0], chs[1], chs[2]);
		} catch(IOException e) {
			System.err.println("Character read error...");
			System.exit(2);
		}
	}
}

public class STEP_15_IO_3 {
	public static void main(String[] args) {
		new IO_31().io_test();
		new IO_32().io_test();
	}
}						// STEP_15/w3/STEP_15_IO_3.java

