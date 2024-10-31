import java.lang.reflect.*;

class Student {
	String	name;
	int	age;

	Student(String name, int age) {
		this.name = name; this.age = age;
	}

	String	getName()	{ return (name); }
	String	getAge_new()	{ return (Integer.toString(age)); }
}

class Annotation_11 {
	Annotation_11() {
		Method		m1 = null, m2 = null;
		int		age = 0;
		Student		st = new Student("Lee", 19);

		try {
			m1 = st.getClass().getDeclaredMethod("getAge_new");
		} catch (NoSuchMethodException e) { }

		if (m1 != null) {
			try {
				age = Integer.valueOf((String)m1.invoke(st));
			}
			catch (IllegalAccessException e) { }
			catch (InvocationTargetException e) { }
		}
		else {
			try {
				m2 = st.getClass().getDeclaredMethod("getAge");
				age = (int)m2.invoke(st);
			}
			catch (NoSuchMethodException e) { }
			catch (IllegalAccessException e) { }
			catch (InvocationTargetException e) { }
		}
		System.out.println("Annotation_11 : Age=" + age);
	}
}

class Annotation_12 {
	Annotation_12() {
		Method		m1 = null, m2 = null;
		int		age = 0;
		Student		st = new Student("Lee", 19);

		Class<? extends Student> sc = st.getClass();

		try {
			if ((m1 = sc.getDeclaredMethod("getAge")) != null)
				age = (int)m1.invoke(st);
		}
		catch (NoSuchMethodException e) { }
		catch (IllegalAccessException e) { }
		catch (InvocationTargetException e) { }
		
		System.out.println("Annotation_12 : Age=" + age);
	}
}

class Annotation_13 {
	Annotation_13() {
		Method		m1 = null;
		int		age = 0;
		Student		st = new Student("Lee", 19);

		Class<Student> sc = Student.class;

		try {
			m1 = sc.getDeclaredMethod("getAge_new");
			age = Integer.valueOf((String)m1.invoke(st));
		}
		catch (NoSuchMethodException e) { }
		catch (IllegalAccessException e) { }
		catch (InvocationTargetException e) { }
		
		System.out.println("Annotation_13 : Age=" + age);
	}
}

public class STEP_17_Annotation_1 {
	public static void main(String[] args) {
		new Annotation_11();
		new Annotation_12();
		new Annotation_13();
	}
}			// STEP_17/w1/STEP_17_Annotation_1.java

