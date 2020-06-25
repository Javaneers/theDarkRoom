package com.javaneers.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadScreensInput {
  // Restrict and reserve inputs for menu options
  private static final ArrayList<Integer> allowableInputs = new ArrayList<>(List.of(1,2,8,0));



  public static int getInput() {
    int result = 0;
    Scanner inputMonitor = new Scanner(System.in);
    ConsoleOutput.printMenuItemSelectionPrompt();

    // Check input from console (System.in)
    if (inputMonitor.hasNextInt()) {
      result = inputMonitor.nextInt();
      if (allowableInputs.contains(result)) {
        ConsoleOutput.printInputConfirmation(result);
      }
      else {
        ConsoleOutput.printNotMappedMenuItem(result);
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
