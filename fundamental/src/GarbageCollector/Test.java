package GarbageCollector;

public class Test {
	public static Student createObject() {
		Student s4 = new Student();
		Student s5 = new Student();
		return s4;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1 = s3;

		s1 = null;
		s2 = null;
		Student s6 = createObject();

		s3 = null;
	}

}
