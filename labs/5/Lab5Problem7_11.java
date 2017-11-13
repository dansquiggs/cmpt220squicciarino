import java.util.Scanner;

public class Lab5Problem7_11 {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[] array = new double[10];
		
		// Prompt user for input
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		// Output
		System.out.println("The mean is " + mean(array));
		System.out.println("The standard deviation is " + deviation(array));
	}

	// Method mean
	public static double mean(double[] num) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	
	// Method deviation
	public static double deviation(double[] num2) {
		double mean = mean(num2);
		double sum2 = 0;
		for (int i = 0; i < num2.length; i++) {
			sum2 += Math.pow((num2[i] - mean), 2);
		}
		return Math.sqrt(sum2 / (num2.length - 1));
	}
}
