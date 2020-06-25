package com.javaneers.client;

import com.javaneers.boardSquares.Square;
import com.javaneers.boardSquares.SquareFactory;
import com.javaneers.game.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.stream.Stream;

public class GamePlay {

  public static void start() {

    Screens titleScreen = new Screens("Dark Room","DarkRoomTitle",new ArrayList<String>(List.of("Rules","Start","exit")));
    titleScreen.drawScreen();

    //prompt user for input
    int menuInput = ReadScreensInput.getInput();
    System.out.println(menuInput);

    // RULES == 1
    if (menuInput == 1) {
      Screens rulesScreen = new Screens("Game Rules", "GameRules", new ArrayList<String>(List.of("Main Menu", "exit")));
      rulesScreen.drawScreen();

    // GAMEPLAY == 2
    } else if (menuInput == 2){
      // setup game space
      PlayerSprite player = new PlayerSprite(5);
      Square[][] gameBoard = SquareFactory.createBoard(player);

      // player move
      do {
        player.movePlayer(gameBoard);
      } while (player.getHasWon() == false && player.getHasLost() == false);

      if (player.getHasWon()) {
        Screens winScreen = new Screens("You Won","YouWon",new ArrayList<String>(List.of("Play Again","exit")));
        winScreen.drawScreen();
      }
      else if (player.getHasLost())  {
        Screens gameOverScreen = new Screens("Game Over","GameOver",new ArrayList<String>(List.of("Play Again","exit")));
        gameOverScreen.drawScreen();
//        Execute.main(new String[1]);
      }

    // EXIT == 0
    } else if (menuInput == 0) {

    }

  }

}
