package com.Interview;

public class PrimeNumber {

public static void main(String[] args) {
	
	int number = 6;
	boolean flag= true;
	
	if (number <= 1) {
		flag = false;
	}
	for (int i = 2; i < Math.sqrt(number); i++) {
		if (number % i==0) {
			flag= false;
			break;
		}
	}
	if (flag) {
		System.out.println("its prime");
	}
	else {
		System.out.println("not prime");
	}
}
}
