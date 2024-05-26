import java.util.Scanner;

public class BuzzNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 7 and ends with 7
        if (number % 7 == 0 && number % 10 == 7) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }

        // Close the scanner
        scanner.close();
    }
}