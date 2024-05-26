import java.util.*;

public class KaprekarNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the square of the number
        int square = number * number;

        // Convert the square to a string for easier manipulation
        String squareString = String.valueOf(square);

        // Loop to check for Kaprekar number property
        for (int i = 1; i < squareString.length(); i++) {
            int leftPart = Integer.parseInt(squareString.substring(0, i));
            int rightPart = Integer.parseInt(squareString.substring(i));

            // Check if the sum of left and right parts equals the original number
            if (leftPart + rightPart == number) {
                System.out.println(number + " is a Kaprekar number.");
                return;
            }
        }

        System.out.println(number + " is not a Kaprekar number.");

        scanner.close();
    }

}