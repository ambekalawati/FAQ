package javaLearning_point;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		System.out.println("Enter Two Numbers:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int quotient = i / j;
		int remainder = i % j;
		System.out.println("Quotient :" + quotient);
		System.out.println("Remainder :" + remainder);

	}

}
