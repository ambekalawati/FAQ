package javaLearning_point;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int previous1 = 0;
		int previous2 = 1;
		for (int i = 0; i < num; i++) {
			if (i < 2) {
				System.out.print(i + " ");
			} else {
				int current = previous1 + previous2;
				System.out.print(current + " ");
				previous1 = previous2;
				previous2 = current;
			}
		}
	}

}
