package javaLearning_point;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double root = Math.sqrt(num);
		if ((root - Math.floor(root)) == 0) {
			System.out.println(num + "Is a Perfect Square");
		} else {
			System.out.println(num + "Is not a Perfect Square");
		}

	}

}
