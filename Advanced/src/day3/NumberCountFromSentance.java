package day3;

public class NumberCountFromSentance {

	public static void main(String[] args) {
		String sentance="my name 5 is Alice I 77 have 2 brothers 88 and 2 sisters i am 19 years old 15";
		//System.out.println(sentance);
		
		String words[]=sentance.split(" ");
		//System.out.println(Arrays.toString(words));
		
		int NumberCounter=0;
		for(String word:words)
		{
			//System.out.println(word);
			try
			{
			int n=Integer.parseInt(word);
			NumberCounter++;
			}
			catch(NumberFormatException e1)
			{
				
			}
		}
		System.out.println(NumberCounter);
	}
	
}
