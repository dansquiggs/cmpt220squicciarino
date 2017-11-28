public class Lab6Problem9_1 {

	// Two double data fields named width and height
	private double width;
	private double height;
	
	// A no-arg constructor that creates a default triangle
	public Lab6Problem9_1() {}
	
	// A constructor that creates a rectangle with the specified width and height
	public Lab6Problem9_1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// A method named getArea() that returns the area of this rectangle
	public double getArea() {
		double area = (width * height);
		return area;
	}
	
	// A method named getPerimeter() that returns the perimeter of this rectangle
	public double getPerimeter() {
		double perimeter = width + width + height + height;
		return perimeter;
	}
	
}
