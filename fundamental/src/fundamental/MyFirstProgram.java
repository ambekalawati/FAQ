package fundamental;
public class MyFirstProgram {
	// Class,Object , method, instance variable and static variable
	// Declare a variable e.g int a;
	 int a;
	 // Define a variable
	int b=20;
	
	
	//Define a method
	//<Modifier> <return type> methodName(arg1,arg2,...){}
// private<default<protected<public
	public void add(int a,int b) {
		int c=a+b;
	 System.out.println("Add :"+c);	
	}
	
	
	public void subtract(int x, int y)
	{
		int z=x-y;
		System.out.println("Subtract :"+z);
	}
	public void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiply :"+c);
	}
public void divide(int a, int b)
{
	int c=a/b;
	System.out.println("divide:"+c);
	
}
	public static void main(String[] args) {
		MyFirstProgram z=new MyFirstProgram();
		z.subtract(109,89);
		MyFirstProgram c=new MyFirstProgram();
		c.multiply(40,120);
		MyFirstProgram s=new MyFirstProgram();
		s.divide(100,50);
//Ctrl+D To delete the selected lines.
//		int c=10;
//       int d=20;		
//      int e=c+d;
//      System.out.println(e);
		
		// How to create an Object in java
		// Class Name <referenceName>=new ClassName();
		MyFirstProgram y=new MyFirstProgram();
		//How to call a method in java
		// <referenceName of the Object>.methodName(arg1,arg2,...);
		y.add(60,70);
		
		
		  
	}

}
