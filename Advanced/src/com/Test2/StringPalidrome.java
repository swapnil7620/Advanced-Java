package com.Test2;

public class StringPalidrome {
	
	public static void main(String[] args) {
		
		String Name="Abba".toLowerCase();	
		
		boolean flag = true;
		
		for (int i = 0; i < Name.length() /2; i++) {
			
			if (Name.charAt(i) != Name.charAt(Name.length() -1 -i ))
			{
				flag=false;
				break;					
			}
		}
			if (flag) {		
				System.out.println("its  palidrome String");
			}
			else {
				System.out.println("its  not palidrome String");
			}
	}

}
