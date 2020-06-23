package com.javaneers.client;

import com.javaneers.game.PlayerSprite;
import com.javaneers.game.GameBoard;

public class PlayerSpriteTest {

  public static void main(String[] args) {
    GameBoard board = new GameBoard();
    PlayerSprite testSprite = new PlayerSprite();

    System.out.println(testSprite.toString());

    System.out.println("Move count " + testSprite.getMoveCount());
    testSprite.setMoveCount(10);
    System.out.println("New move count " + testSprite.getMoveCount());
    System.out.println("getPlayerPosition  ROW " + board.getPlayerPosition("row"));
    System.out.println("getPlayerPosition  COL " + board.getPlayerPosition("col"));
  }

}

