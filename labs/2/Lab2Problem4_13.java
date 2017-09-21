import java.util.Scanner;

public class Lab2Problem4_13 {

	public static void main(String[] args) {

		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		char letter2 = Character.toUpperCase(letter.charAt(0));
		
		// Determine consonant or vowel
		if (letter2 == 'B' || letter2 == 'C' || letter2 == 'D' || letter2 == 'F' || letter2 ==  'G' || letter2 == 'H' || letter2 == 'J' || letter2 == 'K'|| letter2 == 'L' || letter2 == 'M' || letter2 == 'N' || letter2 == 'P' || letter2 == 'Q' || letter2 == 'R' || letter2 == 'S' || letter2 == 'T' || letter2 == 'V' || letter2 == 'W' || letter2 == 'X' || letter2 == 'Y' || letter2 == 'Z')
			System.out.println(letter + " is a consonant");
		else if (letter2 == 'A' || letter2 == 'E' || letter2 == 'I' || letter2 == 'O' || letter2 == 'U')
			System.out.println(letter + " is a vowel");

	}

}