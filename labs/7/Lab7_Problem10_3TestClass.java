package idk;

public class Lab7_Problem10_3TestClass {
	
	public static void main(String[] args) {
		
		// test value
		Lab7Problem10_3_MyInteger value = new Lab7Problem10_3_MyInteger(0);
		
		// Use to test isEven()
		Lab7Problem10_3_MyInteger even = new Lab7Problem10_3_MyInteger(2);
		
		// Use to test isOdd()
		Lab7Problem10_3_MyInteger odd = new Lab7Problem10_3_MyInteger(3);
		
		// Use to test isPrime()
		Lab7Problem10_3_MyInteger prime = new Lab7Problem10_3_MyInteger(7);
		
		// Use to test isEquals1()
		
		Lab7Problem10_3_MyInteger testEquals1 = new Lab7Problem10_3_MyInteger(1);
		
		System.out.println("The value is even: " + even.isEven());
		System.out.println("The value is odd: " + odd.isOdd());
		System.out.println("The value is prime: " + prime.isPrime());
		System.out.println("");
		System.out.println("The value is even: " + value.isEven1(2));
		System.out.println("The value is odd: " + value.isOdd1(3));
		System.out.println("The value is prime: " + value.isPrime1(7));
		System.out.println("");
		System.out.println("The value is even: " + value.isEven2(even));
		System.out.println("The value is odd: " + value.isOdd2(odd));
		System.out.println("The value is prime: " + value.isPrime2(prime));
		System.out.println("");
		System.out.println("The value is equal to 0: " + value.equals(1)); // compares value to the # inside ()
		System.out.println("The value is equal to 0: " + value.equals1(testEquals1)); //compares value to testEquals1
		System.out.println("");
		System.out.println("ParseInt: " + Lab7Problem10_3_MyInteger.parseInt("test"));
		System.out.println("ParseInt: " + Lab7Problem10_3_MyInteger.parseInt("AAAGGGHHHHH".toCharArray()));
	}

}
