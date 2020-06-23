package com.javaneers.client;

import com.javaneers.game.GameBoard;

public class GameBoardClient {

  public static void main(String[] args) {
    GameBoard testBoard = new GameBoard();
    System.out.println(testBoard.toString());

    testBoard.setupBoard();

    System.out.println("doorPosition --> " + testBoard.getDoorPosition());
//    System.out.println("playerPosition --> " + testBoard.getPlayerPosition());
    System.out.println("currentBoonCount --> " + testBoard.getBoonCount());
    testBoard.decrementBoonCount();
    System.out.println("boonCount after decrement = " + testBoard.getBoonCount());

    System.out.println(testBoard.toString());

    System.out.println("playerPositionROW: " + testBoard.playerPosition.get("row"));
    System.out.println("playerPositionCOL: " + testBoard.playerPosition.get("col"));
  }

}
