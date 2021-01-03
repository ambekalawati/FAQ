package inheritance;

public class Q2 {
	public static void main(String arg[]) {
		// I i=new I() {};
		// System.out.print(I.x + i.getValue());
		System.out.println(I.x + I.getValue() + I.method());
	}

}

interface I {
	int x = 10;

	public static int getValue() {
		return 5;
	}

	public static String method() {
		return "I";
	}

}
