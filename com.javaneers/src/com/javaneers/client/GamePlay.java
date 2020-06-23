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

    Screens titleScreen = new Screens("Dark Room","",new ArrayList<String>(List.of("Rules","Start","exit")));
    titleScreen.drawHeader();
    titleScreen.drawMenu();
    //Testing printing text file to console
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\StudentWork\\IntmJ\\MiniProject\\theDarkRoom\\com.javaneers\\data\\DarkRoomRules.txt"))) {
      // here is an easy way to dump out all the lines
      // you may not have worked with Java 8 streams, so we give this to you
      Stream<String> lines = reader.lines();
      lines.forEach(System.out::println);
    }
    catch (IOException e) {
      e.printStackTrace();
    }

//    try { Files.lines(Path.of("data","DarkRoomRules.txt")).forEach(line -> System.out.println(line));
//    }
//    catch (IOException e) {
//      e.printStackTrace();
//    }

    ReadScreensInput.getInput();
    GameBoard board1 = new GameBoard(5,5);
    //GameBoard might initialize player eventually, doing that manually in the client for now
    PlayerSprite player1 = new PlayerSprite();
    //player1.movePlayer();
    Screens winScreen = new Screens("You Win","",new ArrayList<String>(List.of("Play Again")));
    winScreen.drawHeader();

    System.out.println("placeholder text");
  }

}
