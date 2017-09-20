import java.util.Scanner;

public class Lab2Problem4_21 {

	public static void main(String[] args) {

		// New Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter a SSN:");
		String ssn = input.nextLine();
		
		// Validity
		int valid = 0;
		for (int i = 0; i < ssn.length(); i++) {
			if ((ssn.length() == 11) && ((i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11) && (ssn.charAt(i) == '0' || ssn.charAt(i) == '1' || ssn.charAt(i) == '2' || ssn.charAt(i) == '3' || ssn.charAt(i) == '4' || ssn.charAt(i) == '5' || ssn.charAt(i) == '6' || ssn.charAt(i) == '7' || ssn.charAt(i) == '8' || ssn.charAt(i) == '9')) && ((ssn.charAt(3) == '-') && (ssn.charAt(6) == '-')))
				valid = 1;
			else
				valid = 2;	
		}
		
		// Output
		if (valid == 1)
			System.out.println(ssn + " is a valid social security number");
		if (valid == 2)
			System.out.println(ssn + " is an invalid social security number");
	}
	
}