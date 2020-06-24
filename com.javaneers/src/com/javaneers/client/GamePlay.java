package com.javaneers.client;

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

// this will contain the loading, turn, and credit method calls
public class GamePlay {

  public static void main(String[] args) {
    //
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
      GameBoard newGameBoard = new GameBoard();
      PlayerSprite newPlayer = new PlayerSprite();
      // TODO: potentially call to 'GameLogic' class?
      newGameBoard.setupBoard();
      newPlayer.movePlayer();
      // TODO: finish gameloop
    // EXIT == 0
    } else if (menuInput == 0) {

    }


//    GameBoard board1 = new GameBoard(5,5);
    //GameBoard might initialize player eventually, doing that manually in the client for now
//    PlayerSprite player1 = new PlayerSprite();
    //player1.movePlayer();
    Screens winScreen = new Screens("You Won","YouWon",new ArrayList<String>(List.of("Play Again","exit")));
    winScreen.drawScreen();
    Screens gameOverScreen = new Screens("Game Over","GameOver",new ArrayList<String>(List.of("Play Again","exit")));
    gameOverScreen.drawScreen();
  }

}
