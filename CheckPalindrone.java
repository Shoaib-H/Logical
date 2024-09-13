package com.Logical;

import java.util.Scanner;

public class CheckPalindrone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check");
		int a = sc.nextInt();
		int orignum = a;
		int rev = 0;

		while (a > 0) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
			a /= 10;
		}
		if (rev == orignum) {
			System.out.println(orignum + " is a Palindrone Number");
		} else {
			System.out.println(orignum + " is Not a Palindrone Number");
		}
	}
}
