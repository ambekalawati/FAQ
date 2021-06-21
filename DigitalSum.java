package javaLearningPoint;

import java.util.Scanner;

public class DigitalSum {

	public static int sumOfDigits(int number) {

		int lastDigit = 0;
		int sum = 0;

		while (number != 0) {
			lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		}

		return sum;
	}

	public static int digitalSum(int number) {
		int result = number;
		while (result / 10 != 0) {
			result = sumOfDigits(result);
		}
		return result;
	}

	public static void main(String[] args) {

		int number = 0;
		int sumOfDigitsUntilSingle = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number:: ");
		number = scan.nextInt();

		sumOfDigitsUntilSingle = digitalSum(number);

		System.out.println(
				"The sum of digits until" + " single digit of the number " + number + " = " + sumOfDigitsUntilSingle);

		scan.close();
	}
}