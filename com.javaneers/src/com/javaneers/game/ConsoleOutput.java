package com.javaneers.game;

//This class contains methods for printing to the console
public class ConsoleOutput {

  // GAME_PLAY
  public static void printExitMessage() {
    System.out.println("Thank you for playing 'The Dark Room' by the Javaneers! " +
            "\n\t Maya Marks, Michael Vance, Matthew Beckerleg" +
            "\n\t 👻..........................................." +
            "\n"
            );
  }

  // PLAYER_SPRITE
  static void printMoveSelectionsPrompt() {
    System.out.println("Please choose the direction you'd like to attempt to move: \n" +
            "\t1. Move Up\n" +
            "\t2. Move Right\n" +
            "\t3. Move Down\n" +
            "\t4. Move Left \n" +
            "\t0. I'm a Loser, Exit Game");
  }
  static void printMovedUp(){
    System.out.println("You took one step up.");
  }
  static void printMovedRight(){
    System.out.println("You took one step right.");
  }
  static void printMovedDown(){
    System.out.println("You took one step down.");
  }
  static void printMovedLeft(){
    System.out.println("You took one step left.");
  }
  static void printCannotMove(int moveCount) {
    if (moveCount == 1) {
      System.out.println("This may be your final regret...");
    }
    else if (moveCount == 2) {
      System.out.println("Now is not the time to run into things!!! ");
    }
    else {
      System.out.println("Ouch! You slammed headfirst into something. Guess you can't go that way...");
    }
  }
  static void printMoveCount(int moveCount) {
    System.out.println("Moves remaining: " + moveCount);
  }

  // READ_PLAYER_INPUT/READ_SCREENS_INPUT
  static void printPlayerMoveSubmissionPrompt() {
    System.out.println("Type 1-4 into console then press enter to move your player");
  }
  static void printNumberOutOfRange(int input){
    System.out.println(input + " is a number out of range\n");
  }
  static void printMenuItemSelectionPrompt() {
    System.out.println("Type the Number Corresponding to Your Selection, Then Press Enter");
  }
  static void printInputConfirmation(int input) {
    System.out.println("user inputted " + input);
  }
  static void printNotMappedMenuItem(int input) {
    System.out.println(input + " is not mapped to a Menu Item\n");
  }
  static void printNotANumber(String input){
    System.out.println(input + " is not a valid NUMBER\n");
  }

  // SCREENS

  // SQUARE_FACTORY
  public static void printBoardLegend() {
    System.out.println("Board Legend: \n 👻 = player \n B = boon \n D = door");
  }

}
