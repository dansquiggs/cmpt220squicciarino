import java.util.Scanner;

public class Lab2Problem3_2 
{

	public static void main(String[] args) 
	{
		// 1. Generate three random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		// 2. Prompt the student to answer "what is number1 + number2 + number 3"
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		// 3. Grade the answer and display result
		if (number1 + number2 + number3 == answer)
		{
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " + " + number3 + " should be " + (number1 + number2 + number3));
		}
	}
}
