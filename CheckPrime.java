package com.Logiical;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check");
		int a = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(a + " is a Prime Number");

		} else {
			System.out.println(a + " is Not a Prime Number");
		}
	}
}
