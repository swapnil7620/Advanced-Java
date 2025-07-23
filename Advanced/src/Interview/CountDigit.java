package com.Interview;

public class CountDigit {

	public static void main(String[] args) {

		String name = " 12  swapnil 222 5 5 6 ";

		String[] s = name.split(" ");
		int counter = 0;
		int count =0;

		
		for (String string : s) {
			try {
				Integer.parseInt(string);
				counter++;

			} catch (NumberFormatException e) {
            count++;
			}
		}
		System.out.println(counter);
		
	}
}
