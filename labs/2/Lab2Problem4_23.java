import java.util.Scanner;

public class Lab2Problem4_23 {

	public static void main(String[] args) {

		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
 
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		 
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		 
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		// Output
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + rate * hours);
		System.out.println("Deductions: ");
		System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTax * 100, federalTax * rate * hours);
		System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTax * 100, stateTax * rate * hours);
		System.out.printf("  Total Deduction: $%.2f\n", (stateTax + federalTax) * rate * hours);
		System.out.printf("Net Pay: $%.2f\n", (1 - stateTax - federalTax) * rate * hours);
	}

}
