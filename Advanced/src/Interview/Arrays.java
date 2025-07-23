package com.Interview;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		int[] values = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < values.length; i++) {		 
			values[i]= scanner.nextInt();
		}
		
		/*
		for (int i = 0; i < values.length -1; i++) {
			for (int j = 0; j < values.length -1; j++) {
				
				while(values[j] > values[j+1]) {
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] =temp;
					
				}
			}
		}
		*/
		
		// reverse the array
		int first =0;
		int last = values.length -1;
		while (first<last) {
			int temp = values[first];
			values[first] = values[last];
			values[last] = temp;
			
			first++;
			last--;
			
		}
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("values "+ values[i]);
		}
		
	}
}
