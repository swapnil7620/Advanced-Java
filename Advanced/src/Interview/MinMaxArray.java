package com.Interview;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr = {1,5,8,20,60,6};
		int min = arr[0];
		int max = arr[0];
		for (int num : arr) {
			if (num < min) {
				min =num;			
			}
			if (num > max) {
				max =num;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
