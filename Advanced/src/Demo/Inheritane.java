package com.Demo;


class Parent{
	void Method() {
		
		System.out.println("Jalsa");
	}

	
}


class child extends Parent{
  public void Method() {// we cannot change to private
		
		System.out.println(" new Jalsa");
	}

	
}
public class Inheritane {

	
	
	public static void main(String[] args) {
		
		Parent parent = new child();
		parent.Method();
		
	}
}
	