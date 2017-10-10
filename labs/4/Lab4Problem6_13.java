
public class Lab4Problem6_13 {

	public static void main(String[] args) {
		// Output table
		double start = 1.0;
		double rows = 20.0;
		System.out.println("\ni          m(i)     ");
		System.out.println("---------------------");
		for (double i = start; i <= rows; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", method(i));
		}
	}

	// method w/ formula
	public static double method(double n) {
		double x = 0;
		for (double i = 1; i<= n; i++) {
			x += i / (i + 1);
		}
		return x;
	}
	
}
