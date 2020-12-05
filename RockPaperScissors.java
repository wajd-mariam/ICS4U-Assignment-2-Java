/*
* Copyright (c) 2020
*
* This program lets user play Rock, Paper, Scissors game 
* against the computer.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/04
*/

import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
  public static void main(String[] args) {
    
    // Declaring used Constants and Variables:
    String userMove = "";
    String computerMove = "";

    // Welcoming user and giving instructions:
    System.out.println("");
    System.out.println("Welcome to Rock, Paper, Scissors game!");
    System.out.println("");
    System.out.println("Valid Moves are [Rock, Paper, Scissors]");
    System.out.println("(Enter Quit to exit game)");
    System.out.println("");

    // Entering a while true Game Loop
    while (true) {
      // Try Catch statement:
      try {
        // Input
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter one of the valid moves above: ");
        userMove = input1.nextLine();
        // Exiting Game:
        if (userMove.equals("Quit")) {
          break;
        }
        // Checking if user entered a valid move:
        if (!userMove.equals("Rock") && !userMove.equals("Paper")
            && !userMove.equals("Scissors")) {
          System.out.println("You didn't enter a valid move :/");
          System.out.println("");
        } else  {
          // Generating Random Numbers:
          final int randomNumber = (int) (Math.random() * 3);
          // Assigning the random generated number to a move and displaying the computer move:
          if (randomNumber == 0) {
            computerMove = "Rock";
          } else if (randomNumber == 1) {
            computerMove = "Paper";
          } else if (randomNumber == 2) {
            computerMove = "Scissors";
          }
          // Printing computer move:
          System.out.println("The Computer chose (" + computerMove + ")");
          System.out.println("");
          
          // Process / Output
          // Determining who won the round and displaying results to user:
          if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
          } else if ((userMove.equals("Paper") && computerMove.equals("Rock"))
                      || (userMove.equals("Rock") && computerMove.equals("Scissors"))  
                      || (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("YOU WON!");
          } else {
            System.out.println("You lost :/");
          }
        }

      // Error catch statement:
      } catch (Exception e) {
        System.out.println("An error occurred");
        System.out.println("");
        break;
      }
    }
    System.out.println("");
    System.out.println("Thanks for playing my game!");
  }
}