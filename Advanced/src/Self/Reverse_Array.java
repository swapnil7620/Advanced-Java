package Self;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {

		
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value at index : " + i);
			arr[i] = scanner.nextInt();

		}

		int first = 0;
		int last = arr.length - 1;

		

				while (first < last) {

				int temp = arr[first];
					arr[first] = arr[last];
					arr[last] = temp;

					first++;
					last--;
		

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
		}
	}

}
