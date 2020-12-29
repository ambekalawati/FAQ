package arrayDataStructures;

public class NumberSystem {
  	public static int add(int digit) {
  		if(digit==0) {
  		return 0;
  		}
  		int lastDigit=digit%10;
  		return lastDigit+add(digit/10);
  	}
	
	/*
	 * Q1. Write a program of odd number.
	 * Q2. Write a program of even number.
	 * Q3. Swap two numbers without using 3rd variable.
	 * Q4. Add all the digits of a given number without using string.
	 * Q5. find length of a given number.
	 * Q6. Write a program of a prime number.
	 * Q7. Write a program of factorial(using with and without recursive).
	 * Q8. Write a program of a fibonacci number.
	 * Q9. Write a program of GCF
	 * Q10. Write a program of LCF
	 * Q11. Reverse a given number
	 * Q12. Check a given number is palindrome
	 * Q13. Check a given number is armstrong
	 */
public static void main(String[] args) {
/*	 for(int i=1;i<=10;i++) {
		 for(int j=i;j%2==0;j++) {
			 System.out.println(j);
		 }
	 }
	 System.out.println("********************");
	 for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(i);
		} 
	 }
//	Q3. Swap two numbers without using 3rd variable.
	 int number1=10;
	 int number2=20;
	 number1=number2+number1;
	 number2=number1-number2;
	 number1=number1-number2;
	 System.out.println("number1: "+number1+" number2: "+number2);
//  Q7. Write a program of factorial(using with and without recursive).
    int number=5;
    int fact=1;
    for(int i=1;i<=number;i++) {
    	fact=fact*i;
    	System.out.println(fact);
    }
// Q8. Write a program of a fibonacci number.
    int firstValue=0;
    int secondValue=1;
    for(int i=0;i<=10;i++) {
    	System.out.println(firstValue);
    	int sumOfPreviousTwo=firstValue+secondValue;
    	firstValue=secondValue;
    	secondValue=sumOfPreviousTwo;
    }
    */
//    Q9. Write a program of GCF
    int a=12;
    int b=16;
    int gcf=1;
    for(int i=1;i<=a && i<=b;i++) {
    	if(a%i==0 && b%i==0) {
    		gcf=i;
    		System.out.println(a+" "+b+" "+gcf);
    	}
    }
// Q10. Write a program of LCF
    int num1=12;
    int num2=16;
    int lcf=1;
    for(int i=1;i<=num1 && i<=num2;i++) {
    	if(num1%i==0 && num2%i==0) {
    		System.out.println(num1+" "+num2+" "+lcf);
    	}
    }
// Q11. Reverse a given number
    int num=123456;
    while(num!=0) {
    	int reverseNum=num%10;
    	num=num/10;
    	System.out.println(reverseNum);
    }
//Q12. Check a given number is palindrome 
    int number=121;
    int temp=number;
    int rev=0;
    while(temp!=0) {
    	int rem=temp%10;
    	rev=rev*10+rem;
    	temp=temp/10;
    }if(number==rev) {
    	System.out.println(number+" is palindrome number");
    }else {
    	System.out.println(number+" is not palindrome number");
    }
//  Q13. Check a given number is armstrong.
    int no=1634;
    int t1=no;
    int len=0;
    while(t1!=0) {
    	len=len+1;
    	t1=t1/10;
    }
    int t2=no;
    int arm=0;
    while(t2!=0) {
    	int mul=1;
    	int rem=t2%10;
    	for(int i=1;i<=len;i++) {
    		mul=mul*rem;
    	}
    	arm=arm+mul;
    	t2=t2/10;
    }
    if(arm==no) {
    	System.out.println(no+" is armstrong number");
    }else {
    	System.out.println(no+" is not a Armstrong number");
    }
//  Q4. Add all the digits of a given number without using string.
   System.out.println(NumberSystem.add(123456));
   
//    Q5. find length of a given number.
   int length=123456;
   int count=0;
   while(length!=0) {
	   length/=10;
	   ++count;
   }
   System.out.println(count);
    }
	 }


	 
	 
	 
	 
