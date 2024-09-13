package com.Logiical;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int a = sc.nextInt();
		int temp = a;
		int count = 0;
		int arm = 0;

		while (temp > 0) {
			count++;
			temp /= 10;

		}
		temp = a;
		while (temp > 0) {
			int q = temp % 10;
			arm += Math.pow(q, count);
			temp = temp / 10;
		}

		if (arm == a) {
			System.out.println(a + " is a Armstrong Number");

		} else {
			System.out.println(a + " is not Armstrong Number");

		}
	}
}
