package com.Logical;

import java.util.Scanner;

public class PrimeRange {
	void checkPrimeRange() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Range to Check");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				int count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i);
				}
			}
		}
}

