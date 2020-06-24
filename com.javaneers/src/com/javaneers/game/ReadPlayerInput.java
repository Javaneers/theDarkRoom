package com.javaneers.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadPlayerInput {
  //Restrict and reserve inputs for four cardinal directions and exiting the game
  private static final ArrayList<Integer> allowableInputs = new ArrayList<>(List.of(1,2,3,4,0));



  public static int getInput(){
    //Forced to initialize result variable because compiler didn't think recursion would resolve null values
    int result = 0;
    Scanner inputMonitor = new Scanner(System.in);
    System.out.println("Type 1-4 into console then press enter to move your player");

    //Check input from console (System.in)
    if (inputMonitor.hasNextInt()) {
      result = inputMonitor.nextInt();
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
    return result;

  }



}
