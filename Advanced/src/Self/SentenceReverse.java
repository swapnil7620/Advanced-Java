package Self;

public class SentenceReverse {

	public static void main(String[] args) {
		
		String input =" hi swapnil  this side";
		String[] word = input.split(" ");
		
		for (int i = 0; i < word.length /2; i++) {
			
			String temp= word[i];
			word[i]=word[word.length -1 -i];
			word[word.length -1 -i]=temp;
		}
		String opString = String.join(" ", word);
		System.out.println(opString);
	}
			
}
