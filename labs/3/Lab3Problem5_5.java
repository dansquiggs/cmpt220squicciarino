
public class Lab3Problem5_5 {

	public static void main(String[] args) {
		
		// formatting
		System.out.printf("%-10s %8s    |     %-8s %10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
	            
		// print table
		int pounds = 0;
		for (int i = 1; i < 200; i += 2) {
	        System.out.printf("%-10d %8.1f    |     %-8d %10.2f%n", 
	        i, // kilograms
	        i * 2.2, // kilograms to pounds
	        pounds, // pounds
	        pounds * 0.4545); // pounds to kilograms
	        pounds += 5; // increase pounds by increments of 5
	        }    

	}

}