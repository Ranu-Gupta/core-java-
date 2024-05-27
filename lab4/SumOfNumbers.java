import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store sum of two-digit and three-digit numbers
        int sumTwoDigit = 0;
        int sumThreeDigit = 0;

        // Prompt user to input 10 integers
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            // Check if number is two-digit or three-digit
            if (number >= 10 && number <= 99) {
                sumTwoDigit += number;
            } else if (number >= 100 && number <= 999) {
                sumThreeDigit += number;
            }
        }

        // Output sum of two-digit and three-digit numbers
        System.out.println("Sum of two-digit numbers: " + sumTwoDigit);
        System.out.println("Sum of three-digit numbers: " + sumThreeDigit);

        scanner.close();
    }
}