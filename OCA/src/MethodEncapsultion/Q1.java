package MethodEncapsultion;

public class Q1 {

	public static void main(String[] args) {
		Integer in = 10;
		System.out.println(method(in));

	}
	public static String method(Number c) {
		return c.toString();
	}
/*	public String method(Object c) {
		return c.toString();
	}*/

/*	private static String method(Object c) {
		return c.toString();
	}
*/
}
