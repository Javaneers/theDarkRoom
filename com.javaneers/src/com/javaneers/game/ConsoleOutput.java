package com.javaneers.game;

//This class contains methods for printing to the console
public class ConsoleOutput {
  //PLAYER SPRITE
  //@beginning of playersprite while loop
  void printMovePrompt() {
    System.out.println("Please choose the direction you'd like to attempt to move:" +
            "\t1. Move Up\n" +
            "\t2. Move Right\n" +
            "\t3. Move Down\n" +
            "\t4. Move Left \n");
  }

  //GAMEBOARD

  //READPLAYERINPUT

  //READSCREENSINPUT
  //line 16
  //System.out.println("Type the Number Corresponding to Your Selection, Then Press Enter");
  // line 22
  void printInputConfirmation(String result) {
    System.out.println("user inputted " + result);
  }

  //SCREENS


}
