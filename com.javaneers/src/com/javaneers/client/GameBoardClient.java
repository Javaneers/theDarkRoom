package com.javaneers.client;

import com.javaneers.game.GameBoard;

public class GameBoardClient {

  public static void main(String[] args) {
    GameBoard testBoard = new GameBoard();
    System.out.println("testBoard spawned: \n" + testBoard.toString());

    // initial
//    testBoard.setupBoard();

//    System.out.println("doorPosition --> " + testBoard.getDoorPosition());
//    System.out.println("playerPosition --> " + testBoard.getPlayerPosition());
//    System.out.println("currentBoonCount --> " + testBoard.getBoonCount());

//    testBoard.decrementBoonCount();
//    System.out.println("boonCount after decrement = " + testBoard.getBoonCount());

//    System.out.println(testBoard.toString());
//
//    System.out.println("playerPositionROW: " + testBoard.playerPosition.get("row"));
//    System.out.println("playerPositionCOL: " + testBoard.playerPosition.get("col"));
//
//    testBoard.updateBoard("player", 3,4);
//    System.out.println("After player moved to row3, col4: " + testBoard.toString());

    testBoard.setupBoard();
    System.out.println("testBoard after setup: \n" + testBoard.toString());

    System.out.println("getPlayerPosition: " +
      testBoard.getPlayerPosition());
    System.out.println("getPlayerPosition('row') --> " +
      testBoard.getPlayerPosition("row"));
    System.out.println("getPlayerPosition('col') --> " +
      testBoard.getPlayerPosition("col"));

    testBoard.updateBoard("player", 1, 2);
    System.out.println("after moving player to row1, col2: " + testBoard.toString());

    testBoard.updateBoard("player", 1, 3);
    System.out.println("after moving player to row1, col3: " + testBoard.toString());

  }

}
