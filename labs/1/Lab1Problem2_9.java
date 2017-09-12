import java.util.Scanner;

public class Lab1Problem2_9 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for info
		System.out.println("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		// Calculate acceleration
		double acceleration = (v1 - v0) / t;
		
		// Display output
		System.out.println("The average acceleration is " + acceleration);
	}
}