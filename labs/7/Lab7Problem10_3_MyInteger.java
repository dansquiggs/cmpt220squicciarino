package idk;

public class Lab7Problem10_3_MyInteger {

	// An int data field named value that stores the int value represented by this object
	
	int value;
	
	// A constructor that creates a MyIngeter object for the specified in value
	
	public Lab7Problem10_3_MyInteger(int num) {
		this.value = num;
	}
	
	// A getter method that returns the int value
	
	public int returnValue() {
		return value;
	}
	
	// The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime
	
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if (!isEven()) 
			return true;
		else
			return false;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i ==0)
				return false;
		}
				return true;
	}
	
	// The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime
	
	public static boolean isEven1(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd1(int value) {
		if (!isEven1(value))
			return true;
		else
			return false;
	}
	
	public static boolean isPrime1(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i ==0)
				return false;
		}
				return true;
	}
	
	// The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime
	
	public static boolean isEven2(Lab7Problem10_3_MyInteger returnEven) {
		return returnEven.isEven();
	}
		
	public static boolean isOdd2(Lab7Problem10_3_MyInteger returnOdd) {
			return returnOdd.isOdd();
	}
	
	public static boolean isPrime2(Lab7Problem10_3_MyInteger returnPrime) {
		return returnPrime.isPrime();
	}
	
	// The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value
	
	public boolean equals(int value1) {
		if (value == value1)
			return true;
		else
			return false;
	}
	
	public boolean equals1(Lab7Problem10_3_MyInteger returnEquals) {
		return returnEquals.equals(value);
	}
	
	// A static method pasreInt(char[]) that converts an array of numeric characters to an int value
	
	public static int parseInt(char[] array) {
		int charToVal = 0;
		for(int i = 0; i < array.length; i++) {
			charToVal = charToVal * 10 + (Character.getNumericValue(array[i]));
		}
		return charToVal;
	}
	
	// A static method parseInt(String) that converts a string into an int value
	
	public static int parseInt(String array) {
		return Lab7Problem10_3_MyInteger.parseInt(array.toCharArray());
	}
	
}
