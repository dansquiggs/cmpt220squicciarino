import java.util.Scanner;

public class Lab5Problem8_11 {

	public static void main(String[] args) {
		
		// create 3x3 matrix
		int coin[][] = new int[3][3];
		
		// new scanner
		Scanner input = new Scanner(System.in);

		// prompt user for input
		System.out.print("Enter a number between 0 and 511: ");
		
		// store values in array
		int x = input.nextInt();
		
		String binary = decimalToBinary(x);
		
		// calculate H or T
		int bIndex = 0;
		for (int i = 0; i < coin.length; i++) {
			for (int j = 0; j < coin[0].length; j++) {
				int side = (binary.charAt(bIndex++) == '0') ? 0 : 1;
				coin[i][j] = side;
			}
		}
		
		// output
		for (int i = 0; i <coin.length; i++) {
			for (int j = 0; j < coin[i].length; j++) {
				char ch = (coin[i][j] == 0) ? 'H' : 'T';
				System.out.print(ch + " ");
			}
			System.out.println("");
		}
	}
			
	// turn decimal into binary
	public static String decimalToBinary(int x) {
		StringBuilder decimalToBinary = new StringBuilder();
		while (x != 0) {
			decimalToBinary.append(x & 1);
			x = x >> 1;
		}
		while (decimalToBinary.length() < 9) {
			decimalToBinary.insert(0, "0");
		}
		return decimalToBinary.toString();
	}
}
