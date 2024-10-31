import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention (RetentionPolicy.SOURCE)
@Target (ElementType.FIELD)
@interface FlagNew_41 { }

@Retention (RetentionPolicy.SOURCE)
@Target (ElementType.METHOD)
@interface FlagNew_42 { }

class Student {
	String	name;

	@FlagNew_41
	int	age;

	Student(String name, int age) { this.name = name; this.age = age; }

	String	getName() { return (name); }

	@FlagNew_41 // 오류 떠야 정상
	String	 getAge() { return (Integer.toString(age)); }
}

class Annotation_41 {
	Annotation_41() { }
}

public class STEP_17_Annotation_4 {
	public static void main(String[] args) {
		new Annotation_41();
	}
}			// STEP_17/w4/STEP_17_Annotation_4.java

