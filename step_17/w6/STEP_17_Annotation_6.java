import java.lang.reflect.*;
import java.lang.annotation.*;

class Student {
	String	name;
	int	age;

	Student(String name, int age) { this.name = name; this.age = age; }
	String	getName()	{ 
		return (name);
	}

	int	getAge(boolean tag)	{
		return (age);
	}
}

class Annotation_61 {
	class HonorStudent extends Student {
		int	scholarShip;

		HonorStudent(String name, int age) { super(name, age); }
		String get_Name() {
			return("Honor " + name);
		}
	}
	Annotation_61() {
		HonorStudent	hst = new HonorStudent("Lee", 19);
		
		System.out.println("Annotation_61...");
		
		System.out.println(hst.getName());
	}
}

class Annotation_62 {
	class HonorStudent extends Student {
		int	scholarShip;

		HonorStudent(String name, int age) { super(name, age); }

		@Override // 오류가 나는게 정상이다.
		String get_Name() {
			return("Honor " + name);
		}
	}
	Annotation_62() {
		HonorStudent	hst = new HonorStudent("Lee", 19);
		
		System.out.println("Annotation_62...");
		
		System.out.println(hst.getName());
	}
}

public class STEP_17_Annotation_6 {
	public static void main(String[] args) {
		new Annotation_61();
		new Annotation_62();
	}
}			// STEP_17/w6/STEP_17_Annotation_6.java

