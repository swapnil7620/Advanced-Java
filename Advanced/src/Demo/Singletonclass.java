package com.Demo;


public class Singletonclass {


		public static void main(String[] args) {
			
			
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		
		
		System.out.println("The looger 1 and Logger are "+ (logger1.equals(logger2)));
		}

}
