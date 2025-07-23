package com.Interview;

public class StringPalidrome {

	public static void main(String[] args) {

		String value = "ABCDCBa".toLowerCase();
		boolean flag = true;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) != value.charAt(value.length() -1 -i)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
