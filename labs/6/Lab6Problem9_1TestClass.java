
public class Lab6Problem9_1TestClass {

	public static void main(String[] args) {
		
		Lab6Problem9_1 rectangle1 = new Lab6Problem9_1(4, 40);
		Lab6Problem9_1 rectangle2 = new Lab6Problem9_1(3.5, 35.9);
		
		// output
		System.out.println("The width and height of rectangle 1 are: (4, 40)");
		System.out.println("The perimeter of rectangle 1 is: " + rectangle1.getPerimeter());
		System.out.println("The area of rectangle 1 is: " + rectangle1.getArea());
		System.out.println("");
		System.out.println("The width and height of rectangle 2 are: (3.5, 35.9)");
		System.out.println("The perimeter of rectangle 2 is: " + rectangle2.getPerimeter());
		System.out.println("The area of rectangle 2 is: " + rectangle2.getArea());
	}

}
