package javaLearning_point;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		int output = 0;
		while (num != 0) {
			output = output * 10 + num % 10;
			num = num / 10;
		}
		if (output == num1) {
			System.out.println(num1 + "Is a Palindrome");
		} else {
			System.out.println(num1 + "Is not a Palindrome");
		}

	}

}
