package com.Logiical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number to Reverse it");
		int a = sc.nextInt();
		int rev = 0;

		while (a > 0) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
			a /= 10;

		}
		System.out.println("The Reversed Number is " + rev);
	}
}
