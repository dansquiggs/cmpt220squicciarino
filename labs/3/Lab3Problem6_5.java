import java.util.Scanner;

public class Lab3Problem6_5 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		// return method
		displaySortedNumbers(num1, num2, num3);
	}
	
	// method displayDortedNumbers
	public static void displaySortedNumbers(double x, double y, double z) {
		double temp;
		if (y < x && y < z) {
			temp = x;
			x = y;
			y = temp;
		}
		else if (z < x && z < y ) {
			temp = x;
			x = z;
			z = temp;
		}
		if (z < y) {
			temp = y;
			y = z;
			z = temp;
		}
		
		// Output
		System.out.println(x + " " + y + " " + z);
	}
}
