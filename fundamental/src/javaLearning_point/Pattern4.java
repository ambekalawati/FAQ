package javaLearning_point;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("\nThe star pattern is... ");
		for (int m = 1; m <= num; m++) {
			for (int n = num; n > m; n--) {
				System.out.print(" ");
			}
			for (int p = 1; p <= (m * 2) - 1; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
