import java.util.Scanner;

public class Lab1Problem2_5 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for subtotal and gratuity rate
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		// Calculate gratuity and total
		double gratuity = gratuityRate / subtotal;
		double total = subtotal + gratuity;
		
		// Output
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}