import java.util.Scanner;

public class Lab4Problem6_19 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Output
		System.out.println(isValid(side1, side2, side3) ? 
				"The area of the triangle is " + area(side1, side2, side3) :
				"Input is invalid");
		}

	// method isValid
	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}
	
	// method area
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
	    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    return area;
	}
	
}
