
public class Lab3Problem6_1 {

	public static void main(String[] args) {
		
		// Display first 100 pentagonal numbers
        for (int i = 1; i < 101; i++){
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

	// method that returns pentagonal numbers
    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)) / 2;
    }
}