package com.Test2;

public class Palidrome {

	public static void main(String[] args) {

		int Number = 55122155;
		int original=Number;
		int Reverse =0;
		while (Number != 0) {

			int digit = Number % 10;
			Reverse = Reverse * 10 + digit;
			Number = Number / 10;

		}	
		
		if (original==Reverse) {
			System.out.println("its palidrome");		
		}
		else {
			System.out.println("its not palidrome Number");
		}
	}
}
