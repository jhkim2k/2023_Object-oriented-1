import java.lang.reflect.*;
import java.lang.annotation.*;

@interface FlagNew_31 { }

@Retention (RetentionPolicy.SOURCE)
@interface FlagNew_32 { }

@Retention (RetentionPolicy.CLASS)
@interface FlagNew_33 { }

@Retention (RetentionPolicy.RUNTIME)
@interface FlagNew_34 { }

class Student {
	@FlagNew_31
	String	name;

	@FlagNew_32
	int	age;

	Student(String name, int age) { this.name = name; this.age = age; }

	@FlagNew_33
	String	getName()	{ return (name); }

	@FlagNew_34
	String	getAge_new()	{ return (Integer.toString(age)); }
}

class Annotation_31 {
	Annotation_31() {
		Field		fn = null, fa = null;
		Method		gn = null, ga = null;
		int		age = 0;
		Student		st = new Student("Lee", 19);
		System.out.println("Annotation_31...");
		try {
			fn = st.getClass().getDeclaredField("name");
			if (fn.isAnnotationPresent(FlagNew_31.class))
				System.out.println(
					"Annotation 'FlagNew_31' is on field 'name' ...");
			else
				System.out.println(
					"Annotation 'FlagNew_31' is not on field 'name' ...");

			fa = st.getClass().getDeclaredField("age");
			if (fa.isAnnotationPresent(FlagNew_32.class))
				System.out.println(
					"Annotation 'FlagNew_32' is on field 'age' ...");
			else
				System.out.println(
					"Annotation 'FlagNew_32' is not on field 'age' ...");

			gn = st.getClass().getDeclaredMethod("getName");
			if (gn.isAnnotationPresent(FlagNew_33.class))
				System.out.println(
					"Annotation 'FlagNew_33' is on field 'getName' ...");
			else
				System.out.println(
					"Annotation 'FlagNew_33' is not on field 'getName' ...");

			ga = st.getClass().getDeclaredMethod("getAge");
			if (ga.isAnnotationPresent(FlagNew_34.class))
				System.out.println(
					"Annotation 'FlagNew_34' is on field 'getAge' ...");
			else
				System.out.println(
					"Annotation 'FlagNew_34' is not on field 'getAge' ...");
		}
		catch (NoSuchFieldException e) { }
		catch (NoSuchMethodException e) { }
	}
}

class Annotation_32 {
	Annotation_32() {
		Method		ga = null;
		int		age = 0;
		Student		st = new Student("Lee", 19);
		System.out.println("Annotation_32...");
		try {
			ga = st.getClass().getDeclaredMethod("getAge");
			if (ga.isAnnotationPresent(FlagNew_34.class))
				age = Integer.valueOf((String)ga.invoke(st));
			else
				age = (int)ga.invoke(st);
		}
		catch (NoSuchMethodException e) { }
		catch (IllegalAccessException e) { }
		catch (InvocationTargetException e) { }

		System.out.println("Age="+age);
	}
}

public class STEP_17_Annotation_3 {
	public static void main(String[] args) {
		new Annotation_31();
		new Annotation_32();
	}
}			// STEP_17/w3/STEP_17_Annotation_3.java

