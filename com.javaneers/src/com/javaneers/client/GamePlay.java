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
    int menuInput = ReadScreensInput.getInput();
    System.out.println(menuInput);
    if (menuInput == 1) {
      Screens rulesScreen = new Screens("Game Rules", "GameRules", new ArrayList<String>(List.of("Main Menu", "exit")));
      rulesScreen.drawScreen();
    } else if (menuInput == 2){

    } else if (menuInput == 0) {

    }

    //Testing printing text file to console
//    try { Files.lines(Path.of("com.javaneers","data","DarkRoomTitle.txt")).forEach(line -> System.out.println(line));
//    }
//    catch (IOException e) {
//      e.printStackTrace();
//    }


    GameBoard board1 = new GameBoard(5,5);
    //GameBoard might initialize player eventually, doing that manually in the client for now
    PlayerSprite player1 = new PlayerSprite();
    //player1.movePlayer();
    Screens winScreen = new Screens("You Win","",new ArrayList<String>(List.of("Play Again")));
    winScreen.drawHeader();

    System.out.println("placeholder text");
  }

}
