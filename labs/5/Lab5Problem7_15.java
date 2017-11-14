import java.util.Scanner;

public class Lab5Problem7_15 {

	public static void main(String[] args) {
		
		// new scanner
		Scanner input = new Scanner(System.in);
		
		// create array
		int[] array = new int[10];
		
		// prompt user for input
		System.out.print("Enter 10 numbers: ");
		
		// store numbers in array
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		// Output
		System.out.print("The distinct numbers are: ");
		array = eliminateDuplicates(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] eliminateDuplicates(int[] list) {
		
		// create new array
		int[] temp = new int[list.length];
		int storeTemp = 0;
		
		// eliminate duplicates
		for (int i = 0; i < list.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < list.length; j++) {
				if (temp[j] == list[i]) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				temp[storeTemp++] = list[i];
			}
		}
		int[] newArray = new int[storeTemp];
		for (int i = 0; i < storeTemp; i++) {
			newArray[i] = temp[i];
		}
		return newArray;
	}
}
