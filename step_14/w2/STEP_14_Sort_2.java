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
	Integer getAge() {
		return(age);
	}
}

class StdComparator implements Comparator<Student> {
	public int 	compare(Student s1, Student s2) {
		  int		c;
		int 		n;
		c = s1.getName().compareTo(s2.getName());
		n = s1.getAge().compareTo(s2.getAge());
		// if		(s1.getName() > s2.getName()) c = 1;
		// else if	(s1.getName() < s2.getName()) c = -1;
		// else						   c = 0;
		return (n);
		
	}
}

class Sort_21 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };
		System.out.println("Sort_21...");
		Arrays.sort(std, new StdComparator());
		//for (Student s: std)
		//	System.out.printf("%s", s.getName());
		for (Student s: std)
			System.out.printf("%s", s.getAge());
		System.out.printf("\n");
	}
}

class Sort_22 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_22...");

		Arrays.sort(std, new Comparator<Student>() {
				public int compare(Student st1, Student st2) {
					return(st1.getName().compareTo(st2.getName()));
				} } );
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_23 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_23...");

		Arrays.sort(std, (Student s1, Student s2) -> 
				{ return(s1.getName().compareTo(s2.getName())); } );
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}

}

class Sort_24 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_24...");

		Arrays.sort(std, (Student s1, Student s2) -> 
						s1.getName().compareTo(s2.getName()) );
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}

class Sort_25 {
	void sort_test() {
		Student[] std = new Student[] { new Student("Lee", 19), 
			 new Student("Kim", 18), new Student("Park", 20) };

		System.out.println("Sort_25...");

		Arrays.sort(std, (s1, s2) -> 
						s2.getName().compareTo(s1.getName()) );
		for (Student s: std)
			System.out.printf("%s", s.getName());
		System.out.printf("\n");
	}
}


public class STEP_14_Sort_2 {
	public static void main(String[] args) {
		new Sort_21().sort_test();
		new Sort_22().sort_test();
		new Sort_23().sort_test();
		new Sort_24().sort_test();
		new Sort_25().sort_test();
	}
}					// STEP_14/w2/STEP_14_Sort_2.java

