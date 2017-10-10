
public class Lab4Problem6_9 {

	public static void main(String[] args) {

		// Output table
		System.out.printf("%-15s%-15s|    %-15s%-15s\n","Feet","Meters","Meters","Feet");
		System.out.println( String.format("%62s"," ").replace(' ', '-') );
		for (int m = 20, f = 1  ; f <=10; f++, m+=5)
			   System.out.printf("%-15.1f%-15.3f|    %-15.1f%-15.3f\n",(float)f, footToMeter(f),(float)m, meterToFoot(m));
	}
	
		// method meterToFoot
		public static double meterToFoot(double meter) {
			  return 3.279 * meter;
		}
		
		// method footToMeter
		public static double footToMeter(double foot) {
			return 0.305 * foot;
		}
}