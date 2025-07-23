package com.Interview;

import java.util.HashSet;
import java.util.Set;

public class LongestCommanSubstring {

	public static void main(String[] args) {

		/*
		String str = "THINKITIVE";
		Set<Character> set = new HashSet<>();
		int maxLen = 0, i = 0, j = 0;
		while (j < str.length()) 
		{
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j++));
				maxLen = Math.max(maxLen, set.size());
			} 
			else {
				set.remove(str.charAt(i++));
			}
		}
		System.out.println("Longest substring length: " + maxLen);
		*/
		
		String value = "Thinkitive";
		Set<Character> set = new HashSet<Character>();
		int max =0,i=0,j=0;
		while (j< value.length()) 
		{
			if (!set.contains(value.charAt(j))) {
				set.add(value.charAt(j++));
				max = Math.max(max, set.size());		
			}
			else {
				set.remove(value.charAt(i++));
			}
			
		}
		System.out.println("LCS : "+max);
	}
}
