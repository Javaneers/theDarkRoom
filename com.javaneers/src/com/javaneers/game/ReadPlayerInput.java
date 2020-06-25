package com.javaneers.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadPlayerInput {
  // Restrict and reserve inputs for four cardinal directions and exiting the game
  private static final ArrayList<Integer> allowableInputs = new ArrayList<>(List.of(1,2,3,4,0));
  static int result = 0;


  public static int getInput(){
    Scanner inputMonitor = new Scanner(System.in);
    ConsoleOutput.printPlayerMoveSubmissionPrompt();

    // Check input from console (System.in)
    if (inputMonitor.hasNextInt()) {
      result = inputMonitor.nextInt();
      if (allowableInputs.contains(result)) {
        ConsoleOutput.printInputConfirmation(result);
      }
      else {
        ConsoleOutput.printNumberOutOfRange(result);
        getInput();
      }
    }
    else {
      String invalidType = inputMonitor.next();
      ConsoleOutput.printNotANumber(invalidType);
      getInput();
    }
    return result;
  }

}
