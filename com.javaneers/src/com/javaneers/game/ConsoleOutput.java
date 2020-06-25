package com.javaneers.game;

//This class contains methods for printing to the console
public class ConsoleOutput {
  //PLAYER_SPRITE
  static void printMoveSelectionsPrompt() {
    System.out.println("Please choose the direction you'd like to attempt to move:" +
            "\t1. Move Up\n" +
            "\t2. Move Right\n" +
            "\t3. Move Down\n" +
            "\t4. Move Left \n");
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
  static void printCannotMove(int moveCount){
    if (moveCount==1){
      System.out.println("This may be your final regret...");
    }
    else if (moveCount == 2){
      System.out.println("Now is not the time to run into things!!! ");
    }
    else {
      System.out.println("Ouch! You slammed headfirst into something. Guess you can't go that way...");
    }
  }
  static void printMoveCount(int moveCount){
    System.out.println("Moves remaining: " + moveCount);
  }
  //GAME_BOARD
  static void printSetupBoardCompleted(){
    System.out.println("Your DarkRoom awaits..");
  }
  static void printGamePiecePosition(String gamePiece, int row, int col){
    System.out.println("Updating " + gamePiece +
            " position to row: " + row + ", col: " + col);
  }

  //READ_PLAYER_INPUT/READ_SCREENS_INPUT
  static void printPlayerMoveSubmissionPrompt(){
    System.out.println("Type 1-4 into console then press enter to move your player");
  }
  static void printNumberOutOfRange(int input){
    System.out.println(input + " is a number out of range\n");
  }
  static void printMenuItemSelectionPrompt(){
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

  //SCREENS


}
