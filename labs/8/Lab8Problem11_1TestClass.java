package idk;

import java.util.Scanner;

public class Lab8Problem11_1TestClass {

	public static void main(String[] args) {
		
		// Prompt the user to enter three sides of the triangle, a color, and a boolean value to indicate whether the triangle is filled
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three sides of the triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter the color of the triangle: ");
		
		String color = input.next();
		
		System.out.println("Is the triangle filled? Enter either 'true' or 'false': ");
		
		boolean filled = input.nextBoolean();
		
		// create a triangle object with these sides and set the color and filled properties using the input
		
		Lab8Problem11_1Triangle triangle = new Lab8Problem11_1Triangle(side1, side2, side3);
		triangle.setFilled(filled);
		triangle.setColor(color);
		
		// display the area, perimeter, color, and true or false to indicate whether it is filled or not
		System.out.println("The sides you entered are " + triangle.getSide1() + " " + triangle.getSide2() + " " + triangle.getSide3());
		System.out.println("The area of the triangle is " + triangle.getArea());
		System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
		System.out.println("The color of the triangle is " + triangle.getColor());
		System.out.println("Is the triangle filled? " + triangle.isFilled());
		
	}

}
