package com.Interview;

public class DuplicateFindOut {

	public static void main(String[] args) {
		
		
		    // find the number of occurrence
		/*
		        String value = "swapnil kishor mahajan";
		        value = value.replaceAll(" ", ""); 

		        for (int i = 0; i < value.length(); i++) {
		            char ch = value.charAt(i);
		            int count = 0;

		            for (int j = 0; j < value.length(); j++) {
		                if (ch == value.charAt(j)) {
		                    count++;
		                }
		            }

		            if (count > 0 && value.indexOf(ch) == i) {
		                System.out.println(ch + " => " + count + " times");
		            }
		        }
		        */
		
	
		
		
	         	String value = "swapnil mahajan";
	         	
	         	value = value.replace(" ", "");
	         	
	         	for (int i = 0; i < value.length(); i++) {
	         		int count =0;
	         		char ch = value.charAt(i);
					
	         		for (int j = 0; j < value.length(); j++) {
                       if (ch== value.charAt(j)) {
                    	   count++;			
					}						
					}
	         		if (count > 0 && value.indexOf(ch)==i) {
	         			System.out.println(ch + "=> "+count+ " times");
					}
				}
		    }
			
	
}
