import java.util.Scanner;

public class Lab5Problem7_9 {

	public static void main(String[] args) {

		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[] array = new double [10];
		
		// Prompt user for input
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		// Output
		System.out.println("The minimum number is: " + min(array));
	}
	
	// Method min
	private static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
