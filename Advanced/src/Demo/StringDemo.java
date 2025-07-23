package com.Demo;

public class StringDemo {

	public static void main(String[] args) {

		// String palindrome  or not
	/*	
		String Word = "ABBA";
		Word.toLowerCase();
		System.out.println(Word.toLowerCase());
		boolean IsPal = true;
		int left = 0;

		int Right = Word.length() - 1;

		while (left < Right) {
			if (Word.charAt(left) != Word.charAt(Right)) {
				IsPal = false;
				break;
			}

			left++;
			Right--;
		}
		System.out.println(IsPal? "its pal ":"its not pal");
*/
		
		
		String word ="ABBAa";
		word.toLowerCase();
		boolean IsPal=true;
		int left =0;
		int right = word.length()-1;
		while(left <right) {
			if (word.charAt(left) != word.charAt(right)) {
				IsPal = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(IsPal? "ispal" : "is not pal");
	}

}
