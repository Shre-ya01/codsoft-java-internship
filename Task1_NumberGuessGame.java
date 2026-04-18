import java.util.Random;
import java.util.Scanner;

public class Task1_NumberGuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        do {
            int secretNumber = random.nextInt(50) + 1; // number between 1 and 50
            int userGuess = 0;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\nNumber Guessing Game");
            System.out.println("Guess a number between 1 and 50");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                } 
                else if (userGuess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } 
                else {
                    System.out.println("Too low. Try again.");
                }
            }

            if (attempts == maxAttempts && userGuess != secretNumber) {
                System.out.println("Game Over. The correct number was: " + secretNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thank you for playing.");
        sc.close();
    }
}