package com.Demo;

public class StringReverse {

	public static void main(String[] args) {

		String string = "babbabaababbab".toLowerCase();

		boolean flag = true;
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) != string.charAt(string.length()-1 -i)) {

				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("not a palidrome  String");
		}
	}
}
