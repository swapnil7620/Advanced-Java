package com.Test2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int Number =10;
		int first=0, second=1;
		if (Number ==1 ) {
			System.out.println(Number);		
		}
		else if (Number ==2) {
			System.out.println(Number);
			
		}
		else {
		
		
			System.out.print(first + " "+ second+" ");
			for (int i = 3; i <= Number; i++) {
				
				int febo= first+second;
				System.out.print(febo+" ");
				
				first=second;
				second=febo;
			}
		}
	}
}

