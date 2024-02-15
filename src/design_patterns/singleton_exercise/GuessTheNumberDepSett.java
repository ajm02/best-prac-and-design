package design_patterns.singleton_exercise;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberDepSett {

    private Random generator;
    private Scanner fromUser;

    public void setGenerator(Random random) {
        generator = random;
    }

    public void setFromUser(Scanner scanner) {
        fromUser = scanner;
    }

    public void playGame() {
        int targetNumber = generator.nextInt(101);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        int guess;

        while (true) {
            guess = fromUser.nextInt(); //just don't give bad values :)
            if (guess == targetNumber) {
                break;
            } else {
                System.out.print("That guess is too ");
                if (guess > targetNumber) {
                    System.out.print("high");
                } else {
                    System.out.print("low");
                }
                System.out.println(" try again!");
            }
        }

        System.out.println("You got it! It was " + targetNumber + " all along!");
    }
}
