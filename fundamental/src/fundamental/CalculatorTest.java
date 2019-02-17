package fundamental;
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculate=new Calculator();
	int addedValue=	calculate.add(10,40);
	System.out.println(addedValue);
	System.out.println(calculate.subtract(40, 30));
	}
}
