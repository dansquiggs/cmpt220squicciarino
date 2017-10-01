import java.util.Scanner;

public class Lab3Problem5_1 {
	
	public static void main(String[] args) {
		
		// New Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num1 = input.nextInt();
		
		// If the user enters 0
				if (num1 == 0) {
					System.out.println("The program has ended.");
					System.exit(0);
				}
		
		// Store values
		int posNums = 0;
		int negNums = 0;
		int count = 0;
		double total = 0;
		
		// Calculations
		while (num1 != 0) {
			if (num1 > 0)
				posNums++;
			else
				negNums++;
			total += num1;// adds most recent num to the total
			count++; // adds one to count every time
			num1 = input.nextInt();
		}
		
		// Average
		double average = total / count;
		
		// Output
		
		System.out.println("The number of positives is: " + posNums + "\nThe number of negatives is: " + negNums + "\nThe total is: " + total + "\nThe average is: " + average);
	}
}
