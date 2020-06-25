package com.javaneers.boardSquares;

import static org.junit.Assert.*;

import com.javaneers.boardSquares.Square;
import com.javaneers.boardSquares.SquareFactory;
import com.javaneers.game.PlayerSprite;
import org.junit.Before;
import org.junit.Test;

public class SquareFactoryTest {

  PlayerSprite player1;
  Square[][] gameBoard;
  @Before
  public void init () {
    player1 = new PlayerSprite(5);
    gameBoard = SquareFactory.createBoard(player1);
  }
  //player spawn cannot be greater than 4 or less than zero
  @Test
  public void playerSpawnTest_shouldReturnValueBetweenZeroAndFour(){
    int result = SquareFactory.playerSpawn(gameBoard);
    assertTrue(result <= 4);
    assertTrue(result >= 0);

    result = SquareFactory.playerSpawn(gameBoard);
    assertTrue(result <= 4);
    assertTrue(result >= 0);

    result = SquareFactory.playerSpawn(gameBoard);
    assertTrue(result <= 4);
    assertTrue(result >= 0);

    result = SquareFactory.playerSpawn(gameBoard);
    assertTrue(result <= 4);
    assertTrue(result >= 0);
  }
}
