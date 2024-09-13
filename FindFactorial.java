package com.Logical;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check");
		int a = sc.nextInt();
		long mul = 1;

		for (int i = 1; i <= a; i++) {
			mul = mul * i;

		}
		System.out.println("The factorial of " + a + " is " + mul);
	}
}
