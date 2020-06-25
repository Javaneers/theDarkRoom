package com.javaneers.client;

import com.javaneers.boardSquares.Square;
import com.javaneers.boardSquares.SquareFactory;
import com.javaneers.game.*;

import java.util.ArrayList;
import java.util.List;

public class GamePlay {
  private static boolean cheatCode = false;

  public static void start() {

    Screens titleScreen = new Screens("Dark Room","DarkRoomTitle", new ArrayList<String>(List.of("Rules","Start","exit")));
    titleScreen.drawScreen();

    // Start App with a Menu Screen and prompt user for input
    int menuInput = ReadScreensInput.getInput();
    System.out.println(menuInput);

    // Interpret user input and use it to manage Screens navigation
    // Go to Rules Screen
    if (menuInput == 8) {
      setCheatCode(true);
      menuInput = ReadScreensInput.getInput();
    }

    if (menuInput == 1) {
      Screens rulesScreen = new Screens("Game Rules", "GameRules", new ArrayList<String>(List.of("Main Menu", "exit")));
      rulesScreen.drawScreen();

    // Go to Game Board environment
    } else if (menuInput == 2){
      // Setup game space
      PlayerSprite player = new PlayerSprite(5);
      Square[][] gameBoard = SquareFactory.createBoard(player);

      // Game Engine
      do {
        player.movePlayer(gameBoard);
      } while (player.getHasWon() == false && player.getHasLost() == false);

      if (player.getHasWon()) {
        Screens winScreen = new Screens("You Won","YouWon", new ArrayList<String>(List.of("Restart to Play Again!")));
        winScreen.drawScreen();
      }
      else if (player.getHasLost())  {
        Screens gameOverScreen = new Screens("Game Over","GameOver", new ArrayList<String>(List.of("Restart to Play Again!")));
        gameOverScreen.drawScreen();
      }

    // Exit Application
    } else if (menuInput == 0) {
        ConsoleOutput.printExitMessage();
    }

  }

  // ACCESSOR METHODS
  public static boolean getCheatCode() {
    return cheatCode;
  }
  private static void setCheatCode(boolean isCheating) {
    cheatCode = isCheating;
  }

}
