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

  public static void roomAnalysis() {
    System.out.println("You fall through a crack in the floor, injuring yourself severely." +
      "\n Struggling to your feet you can sense you're in a small room. " +
      "\n You hold up your hands to check for bleeding, but the darkness is too complete." +
      "\n Your breathing is labored, you feel dizzy." +
      "\n\n You have strength remaining for 7 steps... " +
      "\n Unless you find something to energize yourself." +
      "\n\n Or, who knows, you might get lucky and find the door, " +
      "\nfind the light and survive. \n");
  }

  // PLAYER_SPRITE
  static void printMoveSelectionsPrompt() {
    System.out.println("Please choose the direction you'd like to attempt to move: \n" +
            "\t1. Move Up ↑\n" +
            "\t2. Move Right →\n" +
            "\t3. Move Down ↓\n" +
            "\t4. Move Left ← \n" +
            "\t0. I give up. I choose to die here and become one with the darkness... [Exit Game] \n");
  }
  static void printMovedUp(){
    System.out.print(" and successfully took one step UP.");
  }
  static void printMovedRight(){
    System.out.print(" and successfully took one step RIGHT.");
  }
  static void printMovedDown(){
    System.out.print(" and successfully took one step DOWN.");
  }
  static void printMovedLeft(){
    System.out.print(" and successfully took one step LEFT.");
  }
  static void printCannotMove(int moveCount) {
    if (moveCount == 1) {
      System.out.println("You can barely stand. This may be your final moments...");
    }
    else if (moveCount == 2) {
      System.out.println("Now is not the time to run into things!!! \n");
    }
    else {
      System.out.println("Ouch! You slammed headfirst into something. Guess you can't go that way... \n");
    }
  }
  static void printMoveCount(int moveCount) {
    System.out.println("\n  Moves remaining: " + moveCount);
  }

  // READ_PLAYER_INPUT/READ_SCREENS_INPUT
  static void printPlayerMoveSubmissionPrompt() {
    System.out.println("Type 1-4 into your console, then press enter to move \n");
  }
  static void printNumberOutOfRange(int input){
    System.out.println(input + " is not a valid movement selection. Try again explorer. \n");
  }
  static void printMenuItemSelectionPrompt() {
    System.out.println("Type the Number Corresponding to Your Selection, Then Press Enter");
  }
  static void printInputConfirmation(int input) {
    System.out.print("You selected " + input);
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
    System.out.println("Board Legend: \n 👻 = player \n \uD83C\uDF81 = boon \n  \uD83D\uDEAA = door");
  }

}
