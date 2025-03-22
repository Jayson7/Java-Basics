
// Import Scanner class for user input
import java.util.Scanner;

// Define a class named MultiplicationTable
public class MultiplicationTable {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt(); // Read the input number

        // Ask for the table range (how far to multiply)
        System.out.print("Enter the range (e.g., 10 for up to 10x): ");
        int range = scanner.nextInt(); // Read the range input

        System.out.println("\nMultiplication Table for " + number + " up to " + range + ":\n");

        // Loop to generate the multiplication table
        for (int i = 1; i <= range; i++) {
            // Print each line in the format: number x i = result
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
