package com.Interview;

public class ReverseTheWord {
   public static void main(String[] args) {
	
	   String input ="swapnil mahajan hi";
	   
	   String [] s = input.split(" ");
	   for (int i = s.length -1; i >=0; i--) {
		System.out.print(s[i]+" ");
	}
}
}
