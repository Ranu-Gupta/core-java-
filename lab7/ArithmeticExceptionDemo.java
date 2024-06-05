package lab_30_5_24;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);

    	        // Input from the user
    	        System.out.print("Enter the numerator: ");
    	        int numerator = scanner.nextInt();

    	        System.out.print("Enter the denominator: ");
    	        int denominator = scanner.nextInt();

    	        try {
    	            // Attempt to divide the numerator by the denominator
    	            int result = numerator / denominator;
    	            System.out.println("The result is: " + result);
    	        } catch (ArithmeticException e) {
    	            // Handle the ArithmeticException
    	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
    	        }
    	        // Close the scanner
    	        scanner.close();
    }
}

