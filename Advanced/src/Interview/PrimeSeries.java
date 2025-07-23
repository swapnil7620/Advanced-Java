package com.Interview;

public class PrimeSeries {

	public static void main(String[] args) {

		int number = 200;

		int Count = 0;
		int k = 5;
		for (int i = 2; i < number; i++) {
			int counter = 0;
			for (int j = 1; j < number; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				Count++;
				System.out.println(i);
				if (Count == k) {
					System.out.println("kth prime number is : " + i);
				}
			}
		}
		if (Count < k) {
			System.out.println("value is less than k");

		}
		System.out.println("total prime Numbers are : " + Count);
		
	}
}
