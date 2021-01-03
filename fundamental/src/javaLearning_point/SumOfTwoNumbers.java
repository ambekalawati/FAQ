package javaLearning_point;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of two integer =" + sum);

	}
}
