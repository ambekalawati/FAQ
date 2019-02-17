package fundamental;

public class Identifiers {
	static private byte b=120;// Byte
	static private int i;//Integer
	private short s;//Short
	private long l;//Long
	private float f;//Float
	private double d;//Double
	static {
		System.out.println(i);
//		System.out.println(s);
	}
	{
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String[] args) {
//		Identifiers id=new Identifiers();
//		System.out.println(id.d);
//		System.out.println(Test.rollNo);
//		Test test=new Test();
//		System.out.println(test.name);
//		System.out.println(test.rollNo);
		System.out.println(Byte.MIN_VALUE+ "   "+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"  "+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"  "+Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE+"  "+Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"  "+Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"  "+Double.MAX_VALUE);
	     System.out.println(Character.MIN_VALUE+" "+Character.MAX_VALUE);

	}

}
