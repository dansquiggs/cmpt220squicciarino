import java.util.Date;

public class Lab6Problem9_3 {

	public static void main(String[] args) {
		// create date object
		Date date;
		
		// set elapsed time
		long time = 10000;
		
		// increment and display date & time
		for (int i = 0; i < 8; i++) {
			time *= 10;
			date = new Date(time);
			System.out.println(date.toString());
		}
		
	}

}
