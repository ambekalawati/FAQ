package javaLearning_point;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int length = (String.valueOf(num)).length();
		int output = 0;
		while (temp != 0) {
			output = output + (int) (Math.pow((temp % 10), length));
			temp = temp / 10;

		}
		if (output == num) {
			System.out.println(num + "Is an Armstrong Number");
		} else {
			System.out.println(num + "Is not an Armstrong Number");
		}
	}

}
