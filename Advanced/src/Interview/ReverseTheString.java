package com.Interview;

public class ReverseTheString {

	public static void main(String[] args) {
		
//		String values = "swapnil";
//		
//		 char[] cha = values.toCharArray();
//		int first =0;
//		int second = cha.length -1;
//		while (first < second) {
//			char temp = cha[first];
//			cha[first] =cha[second];
//			cha[second] =  temp;
//			first++;
//			second--;
//		}
//		String reversed = new String(cha);
////		System.out.println(reversed);
//		
		
		String val ="swapnil";
		String val2 = "";
		for (int i = val.length() -1 ; i>=0; i--) {
			val2 = val2 + val.charAt(i);
			
		}
		System.out.println(val2);
	}
	
	
}
