package javaLearning_point;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a Year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + "Is a Leap Year");
				} else {
					System.out.println(year + "Is not a Leap Year");
				}
			} else {
				System.out.println(year + "Is a Leap Year");
			}
		} else {
			System.out.println(year + "Is not a Leap Year");
		}
	}

}
