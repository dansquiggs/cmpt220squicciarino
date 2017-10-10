import java.util.Scanner;

public class Lab4Problem7_5 {

	public static void main(String[] args) {

		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Create array and variables
		int[] array = new int[10];
		int num1, i = 0, j, k = 0;
		
		// Prompt user for input
		System.out.print("Enter 10 numbers: ");
		while (k < 10 ) {
			num1 = input.nextInt();
			k++;
			for (j = 0; j<= i; j++ ) {
				if (num1 == array[j]) {
					break;
				}
			}
			if (j - i == 1) {
				array[i] = num1;
				i++;
			}
		}

		// Output
		System.out.println("The number of distinct number is " + i);
		System.out.println("The distinct numbers are: ");
		for (int j2 = 0; j2 < i; j2++) {
			System.out.print(array[j2] + " ");
		}
	}

}
