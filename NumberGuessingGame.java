import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == randomNumber) {
                System.out.printf("Congratulations! You guessed the number in %d guesses.\n", numberOfGuesses);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low. Please try again.");
            } else {
                System.out.println("Your guess is too high. Please try again.");
            }
        }

        scanner.close();
    }
}
