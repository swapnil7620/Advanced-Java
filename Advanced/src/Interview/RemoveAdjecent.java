package com.Interview;

public class RemoveAdjecent {

	public static void main(String[] args) {
		 String input = "abbaca";
	        StringBuilder result = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            int len = result.length();
	            
	            if (len > 0 && result.charAt(len - 1) == ch)
	                result.deleteCharAt(len - 1);
	            else
	                result.append(ch);
	        }

	        System.out.println(result.toString()); 	

}
}