import java.util.Scanner;

public class Lab4Problem7_3 {
    public static void main(String[] args) {
    	
    	// Create Scanner
        Scanner input = new Scanner(System.in);

        //Create array
        int[] values = new int[100];
        
        // Prompt for user input
        System.out.print("Enter the integers between 1 and 100: ");
        int x;
        int count = 0;
        do {
            x = input.nextInt();
            values[count] = x;
            count += 1;
        }
        while (x != 0);

        // Call countOccurrence
        countOccurrence(values);
    }

    // countOccurence
    public static void countOccurrence(int[] list) {
        // Calculate Occurrences
    	for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }
            // Output
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", 
                    i, count, count > 1 ? "times" : "time");
        }
    }
}