import java.util.Scanner;

public class Lab3Problem5_16 {

	public static void main(String[] args) {
		
		// Create Scanner
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();
		
		// Calculate factors
		int x = 2; // use this to check for factors
		while ((num1 / x) != 1) {
			if ((num1 % x) == 0) {
				System.out.print(x + ", ");
				num1 /= x;
			}
			else
				x++;
		}
		System.out.println(num1 + ".");

	}

}
