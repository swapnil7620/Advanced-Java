package day3;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		int result=test();
		System.out.println(result);
		
	}

	private static int test() 
	{
		try
		{
			int ans=10/1;
			return 1;
		}
		catch(ArithmeticException e1)
		{
		
			return 2;
		}
		finally
		
		{	
			return 3;
		}
	}

}
