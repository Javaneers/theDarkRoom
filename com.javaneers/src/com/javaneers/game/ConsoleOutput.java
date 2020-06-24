package com.javaneers.game;

//This class contains methods for printing to the console
public class ConsoleOutput {
  //PLAYER SPRITE
  //@beginning of playersprite while loop
  static void printMoveSelectionsPrompt() {
    System.out.println("Please choose the direction you'd like to attempt to move:" +
            "\t1. Move Up\n" +
            "\t2. Move Right\n" +
            "\t3. Move Down\n" +
            "\t4. Move Left \n");
  }

  //GAMEBOARD

  //READPLAYERINPUT
  static void printPlayerMoveSubmissionPrompt(){
    System.out.println("Type 1-4 into console then press enter to move your player");
  }
  static void printNumberOutOfRange(int input){
    System.out.println(input + " is a number out of range\n");
  }

  //READSCREENSINPUT
  //line 16
  static void printMenuItemSelectionPrompt(){
    System.out.println("Type the Number Corresponding to Your Selection, Then Press Enter");
  }// line 22
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