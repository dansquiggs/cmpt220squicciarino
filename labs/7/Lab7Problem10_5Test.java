package idk;

import java.util.Scanner;

public class Lab7Problem10_5Test {

    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        Lab7Problem10_5 stack = new Lab7Problem10_5(20);

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
	
}
