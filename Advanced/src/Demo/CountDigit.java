package com.Demo;

public class CountDigit {

	public static void main(String[] args) {

		String Name = "abkns 3 1 3 5 66 3 fhgf ";

		String word[] = Name.split(" ");
		int count = 0;
		

		for (String string : word) {
			try {
				Integer.parseInt(string);
				count++;
			} catch (NumberFormatException e) {
			}
		}

		System.out.println(count);

	}
}
