import java.io.*;

class Student {
	String	name;
	int		age;
	Student(String name, int age) { setName(name); this.age = age; }
	String	getName()	{ return(name); }
	int		getAge()	{ return(age);  }
	void		setName(String name) {
		this.name = name + "     ".substring(0, 5-name.length());
	}
	void 		setAge(int age)		{ this.age = age; }
}

class IO_71 {
	void io_test() {
		RandomAccessFile raf = null;
		System.out.println("IO_71...");
		try {
			raf = new RandomAccessFile("record.bin", "rw");
		} catch (FileNotFoundException e) {
			System.err.println(
					"Random file open error..."); System.exit(1);
		}

		Student st1 = new Student("Lee", 19);
		Student st2 = new Student("Kim", 18);
		Student st3 = new Student("Park", 20);
		try {
			raf.writeUTF(st1.getName()); raf.writeInt(st1.getAge());
			raf.writeUTF(st2.getName()); raf.writeInt(st2.getAge());
			raf.writeUTF(st3.getName()); raf.writeInt(st3.getAge());
			raf.close();
		} catch(IOException e) {
		}
		System.err.println("Random file write success...");
	}
}

class IO_72 {
	void io_test() {
		RandomAccessFile raf = null;
		System.out.println("IO_72...");
		try {
			raf = new RandomAccessFile("record.bin", "rw");
		} catch (FileNotFoundException e) {
			System.err.println(
					"Random file open error..."); System.exit(1);
		}
		Student st;
		try {
			raf.seek((7+4)*2);
			st = new Student(raf.readUTF(), raf.readInt());
			System.out.println("3rd: " + st.getName() + ", " +
										st.getAge());
			raf.seek((7+4)*0);
			st = new Student(raf.readUTF(), raf.readInt());
			System.out.println("1st: " + st.getName() + ", " + 
										st.getAge());
			raf.seek((7+4)*1);
			st = new Student(raf.readUTF(), raf.readInt());
			System.out.println("2nd: " + st.getName() + ", " +
										st.getAge());
			raf.close();
		} catch (IOException e) {
		}
		System.out.println("Random file read sucess...");
	}
}

public class STEP_15_IO_7 {
	public static void main(String[] args) {
		new IO_71().io_test();
		new IO_72().io_test();
	}
}						// STEP_15/w7/STEP_15_IO_7.java

