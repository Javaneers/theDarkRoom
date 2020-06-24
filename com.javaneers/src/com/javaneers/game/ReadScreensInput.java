package com.javaneers.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadScreensInput {
  //Restrict and reserve inputs for four cardinal directions and exiting the game
  private static final ArrayList<Integer> allowableInputs = new ArrayList<>(List.of(1,2,0));



  public static int getInput(){
    int result = 0;
    Scanner inputMonitor = new Scanner(System.in);
    System.out.println("Type the Number Corresponding to Your Selection, Then Press Enter");

    //Check input from console (System.in)
    if (inputMonitor.hasNextInt()) {
      result = inputMonitor.nextInt();
      if (allowableInputs.contains(result)) {
        System.out.println("user inputted " + result);
      }
      else {
        System.out.println(result + " is not mapped to a Menu Item\n");
        getInput();
      }

    }
    else {
      String invalidType = inputMonitor.next();
      System.out.println(invalidType + " is not a valid NUMBER\n");
      getInput();
    }
    return result;

  }

}
