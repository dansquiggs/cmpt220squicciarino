package idk;

public class Lab7Problem10_11Test {

	public static void main(String[] args) {

		Lab7Problem10_11 c1 = new Lab7Problem10_11(2, 2, 5.5);
		System.out.println("C1 area: " + c1.getArea());
		System.out.println("C1 perimeter: " + c1.getPerimeter());
	    System.out.println("C1 contains coordinate (3,3): " + c1.contains(3, 3));
        System.out.println("C1 contains circle 2: " + c1.contains(new Lab7Problem10_11(4, 5, 10.5)));
        System.out.println("C1 overlaps circle 3: " + c1.overlaps(new Lab7Problem10_11(3, 5, 2.3)));
	}
}
