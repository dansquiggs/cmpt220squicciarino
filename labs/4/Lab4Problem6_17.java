import java.util.Scanner;

public class Lab4Problem6_17 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter n: ");
		int x = input.nextInt();
		
		printMatrix(x);
	}
	
	public static void printMatrix(int x) {
		
		for (int rows = 0; rows < x; rows++) {
			for (int cols = 0; cols < x; cols ++) {
				System.out.print((int)(Math.random() * 2));
			}
            System.out.println("");
        }
	}
}
