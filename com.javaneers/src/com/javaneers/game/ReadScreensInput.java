package com.javaneers.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadScreensInput {
  private static int input = 2;
  //Restrict and reserve inputs for four cardinal directions and exiting the game
  private static final ArrayList<Integer> allowableInputs = new ArrayList<>(List.of(1,2,0));



  public static int getInput(){
    Scanner inputMonitor = new Scanner(System.in);
    System.out.println("Press 1 to read the Rules\nPress 2 to start the game\nPress 0 to exit the application");

    //Check input from console (System.in)
    if (inputMonitor.hasNextInt()) {
      int result = inputMonitor.nextInt();
      if (allowableInputs.contains(result)) {
        System.out.println("user inputted " + result);
      }
      else {
        System.out.println(result + " is a number out of range\n");
        getInput();
      }

    }
    else {
      String invalidType = inputMonitor.next();
      System.out.println(invalidType + " is not a valid number\n");
      getInput();
    }
    return input;

  }

}
