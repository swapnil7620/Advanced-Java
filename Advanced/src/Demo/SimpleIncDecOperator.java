package com.Demo;

public class SimpleIncDecOperator {

	
	public static void main(String[] args) {

		
		String name = "swapnil";
		
		StringBuffer reverseName = new StringBuffer();
		
		for (int i = name.length()-1 ; i >= 0; i--) {
			reverseName.append(name.charAt(i));		
			
		}
		System.out.println(reverseName);
		
		
	}
}
