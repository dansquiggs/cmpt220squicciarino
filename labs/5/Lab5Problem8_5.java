import java.util.Scanner;

public class Lab5Problem8_5 {

	public static void main(String[] args) {
		
		// create matrices
		double [][] a = new double[3][3];
		double [][] b = new double[3][3];
		
		// new scanner
		Scanner input = new Scanner(System.in);

		// prompt user for matrix1
		System.out.print("Enter matrix1: ");
		
		//store matrix1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		// prompt user for matrix2
				System.out.print("Enter matrix2: ");
				
		//store matrix2
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		
		// result
		double[][] c = addMatrix(a,b);
		
		// output
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(a[i][j] + " ");
				if (i == 1 && j == 2) {
					System.out.print(" + ");
				} else {
					System.out.print("   ");
				}	
			}
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(b[i][j] + " ");
				if (i == 1 && j == 2) {
					System.out.print(" = ");
				} else {
					System.out.print("   ");
				}	
			}
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	// add two matrices
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
