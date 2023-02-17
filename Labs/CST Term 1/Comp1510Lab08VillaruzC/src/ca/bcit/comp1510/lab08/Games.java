package ca.bcit.comp1510.lab08;

import java.util.Scanner;
import java.util.Random;

/**
 * Games.
 * This class contains methods used for minigames, including
 * checking your score, guessing a number, and rock, paper, scissors.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Games {
    /** Stores the user's score. */
    private int userScore;
    
    /** Stores the user's input. */
    private Scanner userInput;
    
    /** Generates a random number. */
    private Random randomNumber;
    
    /**
     * Constructor that initializes the instance variables.
     */
    public Games() {
        userScore = 0;
        userInput = new Scanner(System.in);
        randomNumber = new Random();
    }
    
    /**
     * Prints the game menu and allows the user
     * to play the specified games.
     */
    public void play() {
        boolean quitGame = false;
        while (!quitGame) {
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number)");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            switch (userInput.nextInt()) {
                case 1:
                    System.out.println("Your score is " + userScore);
                    break;
                case 2:
                    guessANumber();
                    break;
                case (2 + 1):
                    rockPaperScissors();
                    break;
                case (2 + 2):
                    System.out.println("Thanks for playing!");
                    quitGame = true;
                    break;
                default:
                    System.out.println("That's not a valid choice!");
                    
            }
        }
    }
    
    /**
     * Prompts the user to guess a number generated by
     * the system.
     * 
     * If the number is guessed correctly within
     * five guesses, their score is increased by 5.
     */
    public void guessANumber() {
        final int upperBound = 101;
        final int bonusPoints = 5;
        
        int input;
        int programNumber = randomNumber.nextInt(upperBound);
        int numOfGuesses = 0;
        
        boolean answerFlag = false;
        
        while (!answerFlag) {
            System.out.println("Guess a number between 0 and 100: ");
            input = readInt(userInput);

            if (input > programNumber) {
                System.out.println("Too high, guess again!");
                numOfGuesses++;
            } else if (input < programNumber) {
                System.out.println("Too low, guess again!");
                numOfGuesses++;
            } else {
                System.out.println("Correct!");
                if (numOfGuesses < bonusPoints) {
                    System.out.println("You guessed the number "
                            + "within the first 5 guesses!"
                            + " \nFive points have been awarded!\n");
                    userScore += bonusPoints;
                }
                answerFlag = true;
            }
        }
    }
    
    /**
     * Prompts the user to input rock, paper, or scissors.
     * 
     * If the user input beats the program's choice of rock, paper,
     * or scissors, according to the standard rules, then they're awarded 
     * 5 points; otherwise, they lose 3 points.
     */
    public void rockPaperScissors() {
        final int three = 3;
        
        String userChoice;
        int programNumber = randomNumber.nextInt(three);
        
        boolean endGameFlag = false;
        
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS."
                + "\nWhich one do you choose?");
        while (!endGameFlag) {
            userChoice = userInput.next().toUpperCase();
            switch (userChoice) {
                case "ROCK":
                    if (programNumber == 0) {
                        System.out.println("TIE!");
                    } else if (programNumber == 1) {
                        System.out.println("Nope, I picked Paper.");
                        userScore -= three;
                    } else if (programNumber == 2) {
                        System.out.println("Yes! Rock smashes scissors.");
                        userScore += (three + 2);
                    }
                    endGameFlag = true;
                    break;
                case "PAPER":
                    if (programNumber == 0) {
                        System.out.println("Yes! Paper wraps rock.");
                        userScore += (three + 2);
                    } else if (programNumber == 1) {
                        System.out.println("TIE!");
                    } else if (programNumber == 2) {
                        System.out.println("Nope, I picked Scissors.");
                        userScore -= three;
                    }
                    endGameFlag = true;
                    break;
                case "SCISSORS":
                    if (programNumber == 0) {
                        System.out.println("Nope, I picked Rock.");
                        userScore -= three;
                    } else if (programNumber == 1) {
                        System.out.println("Yes! Scissors cut paper.");
                        userScore += (three + 2);
                    } else if (programNumber == 2) {
                        System.out.println("TIE!");
                    }
                    endGameFlag = true;
                    break;
                default:
                    System.out.println("That is not a valid choice! "
                            + "Try again!");
            }
        }
    }
    
    // Checks if user input is not a number,
    // and prompts user for another input.
    private static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("That is not a valid choice!"
                    + "\nGuess a number between 0 and 100: ");
        }
        return scan.nextInt();
    }
}