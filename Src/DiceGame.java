package Src;

import java.util.Scanner; /*A simple text scanner which can parse 
                          primitive types and strings using regular expressions.*/

public class DiceGame {
    static Scanner input = new Scanner(System.in); // java Scanner class

    public static void main(String[] args) { // MAIN METHOD / Driver

        PairOfDice dice = new PairOfDice(); // Create a pairOfDice Object
        // Print the welcome Messege and Rules.
        System.out.println("---------------------------------");
        System.out.println("    Welcome to the Dice Game!");
        System.out.println("---------------------------------");
        System.out.println("you will be playing against computer!\n");
        System.out.println("Rules: \n");
        System.out.println("The first player to get 100 points Wins." +
                " However, if you roll one 1, you lose all point you have accumulated in your turn.\n" +
                "If you roll two 1's you lose all your points." + " You can turn the dice over at any time."
                + " However, if you roll one or two 1's, you lose your turn.\n"
                + "I (the computer) play by the same rules, "
                + "except I'll always turn over the dice when I've rolled 20 or more points in a single turn");
        System.out.println(
                "-------------------------------------------------------------------------------------------\n");

        DiceTurn(dice); // Calling the 'DiceTurn' Method
    }

    // ------------------
    // METHOD:

    public static void DiceTurn(PairOfDice dice) {
        int playerScore = 0; // initialize the player score to 0
        int playerTurnScore = 0; // initialize the player turn score to 0
        int computerTurnScore = 0; // initialize the computer turn score to 0
        int computerScore = 0; // initialize the computer score to 0
        boolean playerTurn = true; // set playerTurn to true, indicating it is the player's turn

        // The game continues as long as neither player has scored 100 points yet
        while (playerScore <= 100 && computerScore <= 100) {
            // If it is the player's turn
            if (playerTurn) {
                System.out.println("Ready to begin (Enter 'y' when you're ready:)");
                char answer = input.nextLine().charAt(0); // prompt user to input 'y' when ready.

                // While the player continues to roll
                while (answer == 'y') {
                    dice.roll(); // roll the dice
                    System.out.println("You're rolling....");
                    System.out.println("You rolled: " + dice);
                    int rollSum = dice.getDie1() + dice.getDie2(); // get the sum of pairOfDice

                    // If the player rolls two ones
                    if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                        System.out.println("You rolled two 1's...\nyour turn is over.");
                        System.out.println("You lost all your points so far");
                        playerTurnScore = 0;
                        playerScore = 0; // Player score is reset to 0
                        break; // exit the loop
                    }

                    // If the player rolls one one
                    if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                        System.out.println("You rolled a 1.\nYour turn is over.");
                        System.out.println("You lost all your points for this turn");
                        playerTurnScore = 0;
                        break;
                    } else {
                        playerTurnScore += rollSum; // summing up the points
                        System.out.println("this gives a turn total of " + playerTurnScore);
                        System.out.println("and a grand total of " + playerTurnScore);
                        System.out.println("Do you want to continue rolling? 'y' or 'n'");
                        answer = input.nextLine().charAt(0); // ask user Whether continue or not?
                    }
                }

                playerScore += playerTurnScore; // Add the player's turn score to their total score
                System.out.println("-------------------------------");
                System.out.println("    Player score: " + playerScore); // printing player total score
                System.out.println("    Computer Score: " + computerScore); // printing player total score
                System.out.println("--------------------------------");
                playerTurnScore = 0; // reset the player's turn score
                playerTurn = false; // Set the turn to the computer

                // If it is the computer's turn
            } else {
                // The computer continues to roll until it has scored at least 20 points
                while (computerTurnScore < 20) {
                    dice.roll();
                    System.out.println("I'm rolling...");
                    System.out.println("I rolled: " + dice);
                    int rollSum = dice.getDie1() + dice.getDie2();

                    // If the computer rolls two ones
                    if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                        System.out.println("I rolled two 1's...\nyour turn is over.");
                        System.out.println("I lost all your points so far");
                        computerTurnScore = 0;
                        computerScore = 0;
                        break;
                    }

                    if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                        System.out.println("I got one 1...\nI lost all my points for this turn");
                        computerTurnScore = 0;
                        break;
                    } else {
                        computerTurnScore += rollSum; // summing up the points
                        System.out.println("This gives me a turn total of: " + computerTurnScore);
                        System.out.println("and a grand total of " + computerTurnScore);
                    }
                }
                computerScore += computerTurnScore; // Add the player's turn score to their total score
                System.out.println("-------------------------------");
                System.out.println("      Player score: " + playerScore);
                System.out.println("      Computer Score: " + computerScore);
                System.out.println("-------------------------------");
                computerTurnScore = 0;
                playerTurn = true;
            }
        }

        // Check the Winner
        if (playerScore >= 100) {
            System.out.println("\n                         ----------------------------");
            System.out.println("                          Congratulations! You won!!"); // User wins
            System.out.println("                         ----------------------------");
        } else {
            System.out.println("Better Luck Next Time!"); // Computer wins
        }
    }

}