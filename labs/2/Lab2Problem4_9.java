import java.util.Scanner;

public class Lab2Problem4_9 {

	public static void main(String[] args) {

		// New Scanner
		Scanner input = new Scanner(System.in);
		  
		// Prompt user for input
		System.out.print("Enter a character: ");
		String a = input.nextLine();
		
		// Find unicode
		char b = a.charAt(0);
		 
		// Output
		System.out.print("The Unicode for the character " + b + " is " + (int) b);

	}

}
