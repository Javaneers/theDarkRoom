package com.javaneers.client;

import com.javaneers.game.PlayerSprite;
import com.javaneers.game.GameBoard;

public class PlayerSpriteTest {

  public static void main(String[] args) {
    GameBoard testBoard = new GameBoard();
    System.out.println(testBoard.toString());

    PlayerSprite testSprite = new PlayerSprite();
    System.out.println(testSprite.toString());

    testSprite.movePayer();
    System.out.println("move count" + testSprite.getMoveCount());
  }

}

