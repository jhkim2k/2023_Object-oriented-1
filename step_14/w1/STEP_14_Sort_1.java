import java.util.*;

class Student {
	String name;
	Integer age;
	Student(String name, Integer age) {
		this.name = name; this.age = age;
	}
	String getName() {
		return(name);
	}
}

class Sort_11 {
	void sort_test() {
		int[]		mrk = { 19, 18, 20 };

		System.out.println("Sort_11...");

		Arrays.sort(mrk);
		for (int i: mrk)
			System.out.printf("%d", i);
		System.out.printf("\n");
	}
}

class Sort_12 {
	void sort_test() {
		Integer[] mrk = new Integer[] { 19, 18, 20 };

		System.out.println("Sort_12...");

		Arrays.sort(mrk);
		Arrays.sort(mrk, Collections.reverseOrder());
		for (Integer i: mrk)
			System.out.printf("%d", i);
		System.out.printf("\n");
	}
}

class Sort_13 {
	void sort_test() {
		String[] name = new String[] { "Lee", "Kim", "Park" };

		System.out.println("Sort_13...");

		Arrays.sort(name);
		Arrays.sort(name, Collections.reverseOrder());
		for (String s: name)
			System.out.printf("%s", s);
		System.out.printf("\n");
	}

}

class Sort_14 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_14...");

		Arrays.sort(std);
		Arrays.sort(std, Collections.reverseOrder());
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

public class STEP_14_Sort_1 {
	public static void main(String[] args) {
		new Sort_11().sort_test();
		new Sort_12().sort_test();
		new Sort_13().sort_test();
		// new Sort_14().sort_test();
	}
}					// STEP_14/w1/STEP_14_Sort_1.java

