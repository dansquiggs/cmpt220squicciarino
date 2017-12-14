import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lab6Problem9_5 {

	public static void main(String[] args) {
		
		// display current year, month and day
		System.out.println(new Date().toString());
		
		// create gregorian calander
		GregorianCalendar gc = new GregorianCalendar();
		
		// set time
		gc.setTimeInMillis(1234567898765L);
		
		//output
		System.out.println("The year is " + gc.get(Calendar.YEAR) + ", the month is " + gc.get(Calendar.MONTH) + ", the day is " + gc.get(Calendar.DATE));
	}

}
