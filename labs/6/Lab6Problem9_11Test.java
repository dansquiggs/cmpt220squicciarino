import java.util.Scanner;

public class Lab6Problem9_11Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter a, b, c, d, e, f: ");
	    double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        Lab6Problem9_11 linear = new Lab6Problem9_11(a,b,c,d,e,f);
        
        if (linear.isSolvable()) {
            System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
	}

}
