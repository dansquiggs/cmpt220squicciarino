import java.util.Scanner;

public class Lab1Problem2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user for input
		System.out.print("Enter an integer for minutes: ");
		int minutes = input.nextInt();

		int years = minutes / 525600; // Find years
		int remainingDays = (minutes % 525600 / (60 * 24)); // Days remaining
		System.out.println(minutes + " minutes is " + years + " years and " + remainingDays + " days");

	}
}