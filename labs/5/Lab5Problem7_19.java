import java.util.Arrays;
import java.util.Scanner;

public class Lab5Problem7_19 {

	public static void main(String[] args) {
		
		// new scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("Enter the size of the list: ");
		
		// use input to set the size of the array
		int arraySize = input.nextInt();
		int[] list = new int[arraySize];
		
		// prompt user for numbers
		System.out.print("Enter the contents of the list: ");
		
		// put numbers in array
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		
		// output
		System.out.println("The list has " + arraySize + " integers " + Arrays.toString(list));
		if (isSorted(list))
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");
	}
		// find if list is sorted and output
		
		public static boolean isSorted(int[] list) {
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1])
					return false;
			}
				return true;
		}
}
