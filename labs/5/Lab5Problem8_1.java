import java.util.Scanner;

public class Lab5Problem8_1 {

	public static void main(String[] args) {
		
		// create 3x4 matrix
		double[][] matrix = new double[3][4];
		
		//new scanner
		Scanner input = new Scanner(System.in);

		// prompt user for input
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		
		// store numbers
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		// output
		for (int j = 0; j < matrix[0].length; j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));;
		}
	}

	// calculate sum
	public static double sumColumn(double[][] matrix, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++)
			sum+= matrix[i][columnIndex];
		return sum;
	}
}
