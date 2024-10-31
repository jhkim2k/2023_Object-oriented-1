import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
@interface SetAge_51 { int value() default 18; }

class Student {
	String	name;

	@SetAge_51
	int	age_dfl;

	@SetAge_51 (value = 21)
	int	age;

	Student(String name, int age) { 
		this.name = name; this.age = age;
	}

	String	getName()	{ 
		return (name);
	}

	int	getAge(boolean tag)	{
		if (tag) return (age);
		else	 return (age_dfl);
	}
}

class Annotation_51 {
	Annotation_51() {
		Student		st = new Student("Kim", 19);
		Field		fage;
		
		SetAge_51	ans51;
		
		System.out.println("Annotation_51...");
		try {
			fage = st.getClass().getDeclaredField("age_dfl");
			ans51 = fage.getAnnotation(SetAge_51.class);
			fage.set(st, ans51.value());

			fage = st.getClass().getDeclaredField("age");
			ans51 = fage.getAnnotation(SetAge_51.class);
			fage.set(st, ans51.value());
				
		}
		catch (NoSuchFieldException e) { }
		catch (IllegalAccessException e) { }

		String	name = st.getName();
		int	age = st.getAge(true);
		int	age_dfl = st.getAge(false);

		System.out.printf(
			"name =%s, age=%d, age_dfl=%d\n", name, age, age_dfl);
	}
}

class Annotation_52 {
	Annotation_52() {
		Student		st = new Student("Kim", 19);
		Field[]		flds;
		
		SetAge_51	ans51;
		
		System.out.println("Annotation_52...");
		try {
			flds = st.getClass().getDeclaredFields();

			for (Field f: flds) {
				ans51 = f.getAnnotation(SetAge_51.class);
				if (ans51 != null) {
					if (f.getType() == int.class)
						f.set(st, ans51.value());
				}
			}	
		} catch (IllegalAccessException e) { }

		String	name = st.getName();
		int	age = st.getAge(true);
		int	age_dfl = st.getAge(false);

		System.out.printf(
			"name =%s, age=%d, age_dfl=%d\n", name, age, age_dfl);
	}
}

public class STEP_17_Annotation_5 {
	public static void main(String[] args) {
		new Annotation_51();
		new Annotation_52();
	}
}			// STEP_17/w5/STEP_17_Annotation_5.java

