import java.io.*;

class IO_41 {
	void io_test() {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("data.txt");
			bw = new FileWriter(fw);
		} catch (IOException e) {
			System.err.println(
					"Can't open 'data.txt' for output...");
			System.exit(1);
		}
		System.out.println("IO_41...");

		try {
			char		ch1 = 'A', ch2 = 0x42, ch3 = 'C';
			char[]	chs = {'X', 'Y', 'Z'};
			
			String	str = "I am happy";

			for(ch='A'; ch<='Z'; ch++) {
				fw.write(ch);
			}
			
			bw.write(ch1); bw.write(ch2); bw.write(ch3);
			bw.write(chs); bw.write(chs, 0, 3);
			bw.newLine;

			bw.write(str); bw.write(chs, 0, 10);
			bw.newLine;
			bw.close();

		} catch(IOException e) {
			System.err.println("Character & line write error...");
			System.exit(2);
		}
	}
}

class IO_32 {
	void io_test() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("data.txt");
			br = new FileReader(fr);
		} catch (IOException e) {
			System.err.println(
					"Can't open 'data.txt' for output...");
			System.exit(1);
		}
		System.out.println("IO_42...");

		try {
			int		ch1, ch2, ch3, n;
			char[]	chs = new char[3];
			String str1, str2;

			ch1 = br.read(); ch2 = br.read(); ch3 = br.read();
			n = br.read(chs), n = br.read(chs, 0, 1);

			str1 = br.readLine();
			str2 = br.readLine();

			System.out.printf("%c %c %c\n", ch1, ch2, ch3);
			System.out.println("str1=\n" + str1);
			System.out.println("str2=\n" + str2);

		} catch(IOException e) {
			System.err.println("Character & line read error...");
			System.exit(2);
		}
	}
}

public class STEP_15_IO_4 {
	public static void main(String[] args) {
		new IO_41().io_test();
		new IO_42().io_test();
	}
}						// STEP_15/w4/STEP_15_IO_4.java

