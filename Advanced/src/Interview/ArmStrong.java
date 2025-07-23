package com.Interview;

public class ArmStrong {

	public static void main(String[] args) {
		
		int Number = 153;
		int reverse =0;
		int original = Number;
		
		while(Number!=0) {
			
			int digit = Number % 10;
			reverse += digit *digit *digit;
			Number =Number / 10;
		}
		
		if (reverse == original) {
			System.out.println("yes");		
		}
		else {
			System.out.println("No");
		}
	}
}
