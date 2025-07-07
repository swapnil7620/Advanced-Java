package day4;

public class UpcastingDriverApp {

	public static void main(String[] args) {
//		Amitabh a1;			//ref is of Parent class
//		a1=new Abhishek();  //object is of Child class
//		a1.home();   //home is method, method belongs to the object , obj is of Abhishek therefore New Jalsa
//		System.out.println(a1.qualification); //qual is data, data belongs to the ref, ref is of Amitabh therefore it will print the qual of Amitabh
//		a1.car();
		
		
		Amitabh a1;			//ref is of Parent class
		a1=new Aradhya();  //object is of Child class
		a1.home();   //home is method, method belongs to the object , obj is of Abhishek therefore New Jalsa
		System.out.println(a1.qualification); //qual is data, data belongs to the ref, ref is of Amitabh therefore it will print the qual of Amitabh
		a1.car();
		a1.office();
		
		
		//Amitabh a2=new Amitabh();
		
//		Shweta s1=new Shweta();
//		s1.home();
//		s1.car();
//		s1.office();
	} 

}


//P p = new C()