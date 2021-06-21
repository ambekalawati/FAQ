package javaLearningPoint;

import java.util.Scanner;

public class LinearSearch {
	public static int search(int a[], int key, int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int output = search(a, key, n);
		System.out.println(output);
	}
}
