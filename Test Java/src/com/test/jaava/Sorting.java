package com.test.jaava;

public class Sorting {

	public static void main(String[] args) {

		int[] num = { 3, 76, 26, 43, 12, 9, 38, 81 };

		int n = num.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.print("The sorted list is : ");
		for (int i = 0; i < n; i++) {

			System.out.print(num[i] + ",");
		}

	}

}
