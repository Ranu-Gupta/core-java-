import java.util.*;

public class StateCapitalFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store states and capitals
        String[] states = new String[10];
        String[] capitals = new String[10];

        // Input states and capitals
        System.out.println("Enter the names of 10 states and their corresponding capitals:");
        for (int i = 0; i < 10; i++) {
            states[i] = scanner.next();
            capitals[i] = scanner.next();
        }

        // Input state from user to find its capital
        System.out.print("Enter the state whose capital is to be searched: ");
        String stateToSearch = scanner.next();

        // Search for the state and display its capital
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(stateToSearch)) {
                System.out.println("The capital is " + capitals[i]);
                found = true;
                break;
            }
        }

        // If state is not found, display relevant message
        if (!found) {
            System.out.println("State not found or capital not available.");
        }

        scanner.close();
    }

}
