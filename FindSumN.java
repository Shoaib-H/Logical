package com.Logical;

import java.util.Scanner;

public class FindSumN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Find Sum");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum of First " + a + " Natural Numbers is " + sum);
	}
}
