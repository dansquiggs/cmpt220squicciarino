import java.util.Scanner;

public class Lab2Problem3_5 {

	public static void main(String[] args) {

		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for day of the week
		System.out.print("Enter today's day (Sunday being 0 and Saturday being 6): ");
		int day = input.nextInt();
		
		// Assign number to day
		String currentDay = null;
		switch (day)
		{
			case 0: currentDay = "Sunday";
			break;
			case 1: currentDay = "Monday";
			break;
			case 2: currentDay = "Tuesday";
			break;
			case 3: currentDay = "Wednesday";
			break;
			case 4: currentDay = "Thursday";
			break;
			case 5: currentDay = "Friday";
			break;
			case 6: currentDay = "Saturday";
			break;
		}
		
		// Prompt user for days elapsed
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		// Calculate future day
		int futureDay = (day + elapsed) % 7;
		String newDay = null;
		switch (futureDay)
		{
			case 0: newDay = "Sunday";
			break;
			case 1: newDay = "Monday";
			break;
			case 2: newDay = "Tuesday";
			break;
			case 3: newDay = "Wednesday";
			break;
			case 4: newDay = "Thursday";
			break;
			case 5: newDay = "Friday";
			break;
			case 6: newDay = "Saturday";
			break;
		}
		
		// Output
		System.out.println("Today is " + currentDay + " and the future day is " + newDay);
	}
}
