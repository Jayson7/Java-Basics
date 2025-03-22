
// Import necessary classes
import java.util.Scanner; // For user input
import java.util.Random; // For generating random numbers

// Define a class named NumberGuessingGame
public class NumberGuessingGame {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int guess = 0; // Variable to store user's guess
        int attempts = 0; // Counter for number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!\n");

        // Loop until the user guesses the correct number
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // Read the user's guess
            attempts++; // Increase attempt count

            // Check if the guess is too high, too low, or correct
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
