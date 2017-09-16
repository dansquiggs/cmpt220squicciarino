import java.util.Scanner;

public class Lab1Problem2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get Temp
		System.out.print("Enter a temperature in Celsius: ");
		double celsius = input.nextDouble();

		// Convert to Fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
	}
}
