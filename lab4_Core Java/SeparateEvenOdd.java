import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store even and odd numbers
        int[] arr = new int[20];
        int[] even;
        int[] odd;

        // Counters to track the number of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Accept 20 numbers from the user and store them in the array
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Initialize even and odd arrays with appropriate sizes
        even = new int[evenCount];
        odd = new int[oddCount];

        // Transfer even and odd numbers to their respective arrays
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex++] = arr[i];
            } else {
                odd[oddIndex++] = arr[i];
            }
        }

        // Print the elements of the even array
        System.out.println("Even numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the elements of the odd array
        System.out.println("Odd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}