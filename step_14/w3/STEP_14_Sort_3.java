import java.util.*;
import java.util.function.*;

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

class mycmp implements Function<Student, String> {
	public String apply(Student s) {
		return s.getName();
	}
}

class Sort_31 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_31...");

		Comparator cmp = Comparator.comparing(new mycmp());
		Arrays.sort(std, cmp);

		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_32 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		Function<Student, String> stdcmp = 
					new Function<Student, String>() {
						public String apply (Student st) {
							return st.getName();
						}
					};

		System.out.println("Sort_32...");

		Arrays.sort(std, Comparator.comparing(stdcmp));

		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_33 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_33...");

		Arrays.sort(std, Comparator.comparing( (st) ->
								{ return (st.getName()); } ));
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_34 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_34...");

		Arrays.sort(std, Comparator.comparing( (st) -> st.getName()));
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_35 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_35...");

		Arrays.sort(std, Comparator.comparing(Student::getName));

		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

public class STEP_14_Sort_3 {
	public static void main(String[] args) {
		new Sort_31().sort_test();
		new Sort_32().sort_test();
		new Sort_33().sort_test();
		new Sort_34().sort_test();
		new Sort_35().sort_test();
	}
}					// STEP_14/w3/STEP_14_Sort_3.java

