import java.io.*;

class Student implements Serializable {
	String  name;
	Integer age;
	Student(String name, Integer age) {
		this.name = name; this.age = age;
	}
	String getName() {
		return(name);
	}
}

class IO_61 {
	void io_test() {
		ObjectOutputStream os = null;
		System.out.println("IO_61...");

		try {
			os = new ObjectOutputStream(
						new FileOutputStream("object.bin"));
		} catch (FileNotFoundException e) {
			System.err.println("Write open error...");
			System.exit(1);
		} catch (IOException e) {
		}

		Student st1 = new Student("Lee", 19);
		Student st2 = new Student("Kim", 18);
		
		try {
			os.writeObject(st1); os.writeObject(st2);
			os.close();
		} catch(IOException e) {
		}
		System.err.println("Object write success...");
	}
}

class IO_62 {
	void io_test() {
		System.out.println("IO_62...");
		ObjectInputStream os = null;

		try {
			os = new ObjectInputStream(new
						FileInputStream("object.bin"));
		} catch (FileNotFoundException e) {
			System.err.println("Read open error...");
			System.exit(2);
		} catch (IOException e) {
		}

		Student st1;
		Student st2;

		try {
			st1 = (Student )os.readObject();
			st2 = (Student )os.readObject();

			System.out.println(st1.getName() + ", " + 
									st2.getName());
			os.close();
		} catch (ClassNotFoundException e) {
		} catch (IOException e) {
		}
		
		System.out.println("Object read sucess...");
	}
}

public class STEP_15_IO_6 {
	public static void main(String[] args) {
		new IO_61().io_test();
		new IO_62().io_test();
	}
}						// STEP_15/w6/STEP_15_IO_6.java

