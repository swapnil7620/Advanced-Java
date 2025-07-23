package com.Interview;

public class Palidrome {

	public static void main(String[] args) {
		
		int Number = 1231;
		int reverse =0;
		int original = Number;
		
		while (Number !=0) {
			int digit = Number % 10;
			reverse = reverse *10 +digit;
			Number = Number /10;
		}
		System.out.println(original == reverse ? "palidrome " :"not a palidrome Number");
	}
}
