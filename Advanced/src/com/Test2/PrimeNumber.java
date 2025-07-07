package com.Test2;

public class PrimeNumber {

	public static void main(String[] args) {

		int Number = 101;
		
		if (Number < 2 ) {			
			System.out.println("Its not prime");
			return;		
		}
		else {		
		for (int i = 2; i <Number; i++) {
			if (Number % i == 0) {
				System.out.println("Its not prime");
				return;					
			}		
		}
		System.out.println("Number is Prime");
		}

	}
}
