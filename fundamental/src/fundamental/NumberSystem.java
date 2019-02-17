package fundamental;
public class NumberSystem {
	public String isOddNumber(int a) {
		if (a % 2 != 0) {
			return " "+a +" is an odd number";
		} else {
			return " "+a+" is not an odd number.";
		}
	
	}
public boolean isEvenNumber(int b)
{
	if (b%2==0) {
		return true;
	}
	else {
		return false;
	}
}

public void writeTableOf(int input) {
	for(int i=1;i<=10;i++) {
		System.out.println(input*i);
	}
	
}

	public boolean isPrimeNumber(int input) {
		if(input==1 || input<=0) {
			return false;
		}
		for (int n = 2; n < input; n++) {
			if (input % n == 0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		NumberSystem ns = new NumberSystem();
//	String result=	ns.isOddNumber(40);
//
//	System.out.println(result);
//	boolean result2=ns.isEvenNumber(40);
//	System.out.println(result2);
//	ns.writeTableOf(3);
		boolean isPrimeNumber =ns.isPrimeNumber(-1);
		System.out.println(isPrimeNumber);

	}
}
