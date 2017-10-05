package com.test.java;

public class MinMaxNumber {

	public static void main(String[] args) {

		int[] num = { 12, 54, 7, 82, 22, 71, 1, 99 };

		int count = num.length;

		int MaxNum = num[0];
		int MinNum = num[0];

		for (int i = 0; i < count; i++) {

			if (num[i] > MaxNum) {
				MaxNum = num[i];

			}

		}

		System.out.println("Tha Max Number is " + MaxNum);

		for (int i = 0; i < count; i++) {

			if (num[i] < MinNum) {
				MinNum = num[i];

			}

		}

		System.out.println("Tha Min Number is " + MinNum);

	}

}
