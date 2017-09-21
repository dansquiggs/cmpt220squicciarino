import java.util.Scanner;

public class Lab2Problem3_17 {

	public static void main(String[] args) {
		
		// Create New Scanner
        Scanner input = new Scanner(System.in);
        
        // Generate Random Number
        int number, guess; 
        number = (int) (Math.random() * 3);
       
        // Prompt user for input
        System.out.print("Scissor (0), Rock (1), Paper (2): ");
        guess = input.nextInt();
 
        // Determine winner
        if (number == 0 && guess == 0)
            System.out.println("The computer is Scissors. You are Scissors too. It is a draw.");
        if (number == 0 && guess == 1)
            System.out.println("The computer is Scissors. You are Rock. You won.");
        if (number == 0 && guess == 2)
            System.out.println("The computer is Scissors. You are Paper. You lose.");
        if (number == 1 && guess == 0)
            System.out.println("The computer is Rock. You are Scissors. You lose.");
        if (number == 1 && guess == 1)
            System.out.println("The computer is Rock. You are Rock too. It is a draw.");
        if (number == 1 && guess == 2)
            System.out.println("The computer is Rock. You are Paper. You won.");
        if (number == 2 && guess == 0)
            System.out.println("The computer is Paper. You are Scissors. You won.");
        if (number == 2 && guess == 1)
            System.out.println("The computer is Paper. You are Rock. You lose.");
        if (number == 2 && guess == 2)
            System.out.println("The computer is Paper. You are Paper too. It is a draw.");
        
    }

}
