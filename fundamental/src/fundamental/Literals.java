package fundamental;

public class Literals {
	// If static keyword is used before variable then it is called static variable, aka(also know as) class variable/ static variable. Initialization will happen at class Loading
	//time. Memory allocation method area
   // if static keyword is not used before variable then it is called instance variable or non-static variable. Initialization will happen when we creating an object.Memory allocation Heap area
	public static byte b=m3();//0 then 10
	public static short s;//0
	public static int i;//0
	public static long l;//0
	public static float f;//0.0
	public static double d;//0.0
	public char c=m4();
	public boolean bl;


	 static {
	// we can access only static things.
		System.out.println("Static block: "+b);//10
		//System.out.println(c); C.E
	}
	
	{
		// we can access static as well as non-static things.
//		System.out.println("Non Static block :"+b);
		System.out.println("Non Static block: "+c);
		System.out.println("Non Static block: "+bl);
	}
	
	public char m4() {
		System.out.println("Default value of char : "+c);
		return 'c';
	}
	
	public static void m1() {
		System.out.println("Static method :"+b);
		//System.out.println(c); C.E
	}
	
	public void m2() {
		System.out.println("Non Static method :"+b);
		System.out.println("Non Static method: "+c);
	}
	
	public static byte m3() {
		System.out.println("Method m3()"+b);//0
		return 10;
	}
	
public static void main(String[] args) {
	System.out.println("Byte :"+b);//10
	System.out.println("Short :"+s);//0
	System.out.println("Int :"+i);//0
	System.out.println("Long :"+l);//0
	System.out.println("Float :"+f);//0.0
	System.out.println("Double :"+d);//0.0
	Literals lt=new Literals();
	lt.m4();
	
}

static {
	// we can access only static things.
		System.out.println("Static block after main method: "+b);//10
		//System.out.println(c); C.E
	}
{
	System.out.println("Non static block after main method: "+bl);
}
}
