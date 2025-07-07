package com.Test2;

public class PrimeSequence {

	public static void main(String[] args) {

		// Prime Number between 1 to 10 with Nth prime Number

		int Number = 100;
		int count = 0;
		int k=10;

		for (int i = 2; i < Number; i++) {
			int counter = 0;

			for (int j = 1; j <= Number; j++) {

				if (i % j == 0) {
					counter++;

				}
			}
			if (counter == 2) {
				count++;
				if (count==k) {
					System.out.println("Kth prime number is :" +i);			
				}
//				System.out.print("prime Number : " + i+" ");
			}
		}
		System.out.println("Total Number of Prime : "+count);
		

		if (count < k) {
			
			System.out.println("Less than k");
		}
	}
}
