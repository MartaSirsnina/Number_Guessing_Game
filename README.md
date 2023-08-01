# Number_Guessing_Game

This is a simple Number Guessing Game application built in Java. The game allows the player to guess a number within a given range and provides limited attempts to do so. If the guessed number matches the randomly generated number, the player wins; otherwise, the player loses.

## How to Play

1. Clone or download the repository to your local machine.

2. Make sure you have Java installed on your system.

3. Open a terminal or command prompt and navigate to the project directory.

4. Compile the Java file:
   ```
   javac NumberGuessingGame.java
   ```

6. Run the game:
   ```
   java NumberGuessingGame
   ```


7. The game will welcome you and display the range of numbers to guess from. It will also specify the number of attempts you have to guess the correct number.

8. Enter your guess when prompted and press Enter.

9. If your guess is correct, you win! Otherwise, the game will tell you whether your guess was too high or too low.

10. Keep guessing until you either guess the correct number or run out of attempts.

## Customization

You can customize the game's difficulty by modifying the following variables in the `NumberGuessingGame.java` file:

- `rangeStart`: The lower bound of the number range.
- `rangeEnd`: The upper bound of the number range.
- `maxAttempts`: The maximum number of attempts allowed to guess the correct number.

## Example Customization

To make the game more challenging with a wider range and more attempts, you can set `rangeStart` to 1, `rangeEnd` to 1000, and `maxAttempts` to 15.

```
// Example Customization
int rangeStart = 1;
int rangeEnd = 1000;
int maxAttempts = 15;
```

## License

This project is licensed under the MIT License.

Feel free to use, modify, and distribute the code as per the terms of the MIT License.
