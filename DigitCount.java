package com.Logiical;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number to Count Digit");
		int a = sc.nextInt();
		int count = 0;

		while (a > 0) {
			count++;
			a /= 10;

		}
		System.out.println("Total Number of Digits are " + count);
	}

}
