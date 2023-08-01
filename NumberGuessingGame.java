import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeStart = 1;
        int rangeEnd = 100;
        int maxAttempts = 10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + rangeStart + " and " + rangeEnd + ".");

        int randomNumber = (int) (Math.random() * (rangeEnd - rangeStart + 1)) + rangeStart;

        int attempts = 0;
        while (attempts < maxAttempts) {
            System.out.print("Attempt #" + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Too High! Try again.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have run out of attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
