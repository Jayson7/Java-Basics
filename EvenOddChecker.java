
// Import Scanner class to take user input
import java.util.Scanner;

// Define a class named EvenOddChecker
public class EvenOddChecker {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        char choice; // Variable to store user choice (for repeating the program)

        // Loop to allow the user to check multiple numbers
        do {
            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // Read the input number

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }

            // Ask if the user wants to check another number
            System.out.print("Do you want to check another number? (y/n): ");
            choice = scanner.next().charAt(0); // Read the first character of user input

        } while (choice == 'y' || choice == 'Y'); // Repeat if user enters 'y' or 'Y'

        // Close the scanner to free resources
        scanner.close();

        // Print a goodbye message
        System.out.println("Thank you for using the Even-Odd Checker!");
    }
}
