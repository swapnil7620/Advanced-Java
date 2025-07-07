package Self;

import java.util.Arrays;


public class Merge2Array {

	public static void main(String[] args) {
		

//		List<String>  Array1= Arrays.asList("One","Two","Three","Four");
//		List<String>  Array2= Arrays.asList("Five","six ","Seven","Eight");
//		
//		String Arr1 = Array1.toString();
//		String Arr2= Array2.toString();
		
//		  String arrayString = Arrays.toString(Arr1);
//		  String arrayString1 = Arrays.toString(Arr2);
		
		
		String[] Arr1 = {"One","Two","Three","Four"};
		String[] Arr2 = {"Five","six","Seven","Eight"};
	      
		 String s = String.join(" ", Arr1 ) + String.join(" ", Arr2);
		  String[] Word = s.split(" ");	  
		  System.out.print(Arrays.toString(Word));
		

		
	
		
	
	}
}
