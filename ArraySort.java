package com.Logical;

import java.util.Scanner;

public class ArraySort {
	int size;
	int[] a;
	int sort = 0;

	void arraySort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Original Array is ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					sort = a[i];
					a[i] = a[j];
					a[j] = sort;
				}
			}
		}
		System.out.print("\nSorted Array is ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}
	}

}
