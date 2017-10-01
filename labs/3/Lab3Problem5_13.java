
public class Lab3Problem5_13 {

	public static void main(String[] args) {

		// declare variables
		int n = 1;
		
		// while statement
		while (n * n * n < 12000)
			n++;
		
		// output
		System.out.println("The largest n such that n^3 is less than 12,000: " + (n - 1));
		
	}

}
