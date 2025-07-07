package com.Test2;

public class ReverseString {

	public static void main(String[] args) {

		String Name = "ABCD";
		
		String Name2 = "";
		
		for (int i = Name.length() - 1; i >= 0; i--) {
			Name2 +=  Name.charAt(i); //DCBA
		}
		System.out.println(Name2);
		
		
		
		char[] c= Name.toCharArray();
		
		for (int i = c.length -1; i >=0; i--) {
			
			System.out.print(c[i]);
			
		}

	}
}
