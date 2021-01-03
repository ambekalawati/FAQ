package javaLearning_point;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int output = 0;
		while (number != 0) {
			output = output * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("ReverseNumber is: " + output);
	}

}
