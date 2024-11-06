package vonglap;

import java.util.Scanner;
import java.util.Random;

public class Excercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;

        int guess = 0;

        while (guess != numberToGuess) {
            System.out.print("Guess a number between 1 and 50: ");

            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Your number is higher.");
            } else if (guess > numberToGuess) {
                System.out.println("Your number is lower.");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        }
        scanner.close();
    }
}
