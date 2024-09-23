package com.Logical;

import java.util.Scanner;

public class Fibonacci {
	Scanner sc = new Scanner(System.in);

	int n1 = 0;
	int n2 = 1;
	int n3 = 0;

	void checkFibonacci() {
		System.out.println("Enter length of Series");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(n1);

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
