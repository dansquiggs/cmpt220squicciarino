import java.util.Scanner;

public class Lab3Problem6_3 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();

		// Output
		System.out.println(num1 + (isPalindrome(num1) ? " is " : " is not ") +
					"a palindrome.");
	}

	// Method isPalindrome
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	// Method reverse
	public static int reverse(int num) {
		String reverse = ""; 	// Placeholder
		String n = num + ""; // Convert number to string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i); // Calculate reverse
		}
		return Integer.parseInt(reverse);
	}
}