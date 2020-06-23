package com.javaneers.client;

import com.javaneers.game.*;

import java.util.ArrayList;
import java.util.List;

// this will contain the loading, turn, and credit method calls
public class GamePlay {

  public static void main(String[] args) {

    Screens titleScreen = new Screens("Dark Room","",new ArrayList<String>(List.of("Rules","Start")));
    titleScreen.drawHeader();
    GameBoard board1 = new GameBoard(5,5);
    //GameBoard might initialize player eventually, doing that manually in the client for now
    PlayerSprite player1 = new PlayerSprite();
    player1.movePayer();

    System.out.println("placeholder text");
  }

}
