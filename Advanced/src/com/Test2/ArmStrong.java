package com.Test2;

public class ArmStrong {

	public static void main(String[] args) {
		
		int Number =153;
		
		int original = Number;
		int Multi=0;
		
		while (Number !=0) {
			
			int digit = Number % 10;
			
			Multi += digit * digit* digit;
			
			Number = Number /10;
		}
		
		if (original == Multi) {
			System.out.println("Armstrong Number ");
			
		}
		
		else {
			System.out.println("Non Aromstrong");
		}
		
	}
}
