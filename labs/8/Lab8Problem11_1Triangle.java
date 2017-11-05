package idk;

// Design a class named Triangle that extends GeometricObject
public class Lab8Problem11_1Triangle extends Lab8Problem11_1GeometricObject {

	// Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// A no-arg constructor that creates a default triangle
	public Lab8Problem11_1Triangle() {}
	
	// A constructor that creates a triangle with the specified side1, side2, and side3
	public Lab8Problem11_1Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// The accessor methods for all three data fields
	public double getSide1() {
		return side1;
	}
	public void setSide1() {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2() {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;	
	}
	public void setSide3() {
		this.side3 = side3;
	}
	
	// A method named getArea() that returns the area of this triangle
	public double getArea() {
		double x = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(x*(x - side1)*(x - side2)*(x - side3));
		return area;
	}
	
	// A method named getPerimeter() that returns the perimeter of this triangle
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	// A method named toString() that returns a string description for triangle
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}
