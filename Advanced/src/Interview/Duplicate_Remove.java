package com.Interview;

import java.util.LinkedHashSet;

public class Duplicate_Remove {

	public static void main(String[] args) {
		
		String value ="palindrome Number".toLowerCase();
		
		char[]  values2 = value.toCharArray();
		
		StringBuffer  stringBuffer  = new StringBuffer();
		LinkedHashSet<Character> LHS = new LinkedHashSet<Character>();
		
		
		for (Character character : values2) {
			if (character !=' ')
			{
				LHS.add(character);
			}
			
		}
		for (Character character : LHS) {
			stringBuffer.append(character);
		}
		
		System.out.println(stringBuffer);
	}
}
