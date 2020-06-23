package com.javaneers.client;

import com.javaneers.game.PlayerSprite;
import com.javaneers.game.GameBoard;

public class PlayerSpriteTest {

  public static void main(String[] args) {

    PlayerSprite testSprite = new PlayerSprite();

    System.out.println(testSprite.toString());

    System.out.println("Move count " + testSprite.getMoveCount());

    System.out.println(" ");
  }

}

