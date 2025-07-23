package com.Interview;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int Number = 10;
		int first =0;
		int second =1;
		if (Number == 1) {
			System.out.print(Number);
		}
		else if(Number ==2) {
			System.out.print(Number);
		}
		else 
		{
		System.out.print(first +" "+ second+" ");
		for (int i = 3; i <= Number; i++) {
			int temp = first +second;
			System.out.print(temp + " ");
			 first = second;
			 second =temp;
		}
		}
		
	}
}
