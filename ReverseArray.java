package com.Logical;

import java.util.Scanner;

public class ReverseArray {
	int size;
	int[] a;

	void reverseArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
