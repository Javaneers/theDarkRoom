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

//    testBoard.setupBoard();
//    System.out.println("testBoard.toString() after setup: \n " + testBoard.toString());
//
//    System.out.println("getPlayerPosition: " +
//      testBoard.getPlayerPosition());
//    System.out.println("getPlayerPosition('row') --> " +
//      testBoard.getPlayerPosition("row"));
//    System.out.println("getPlayerPosition('col') --> " +
//      testBoard.getPlayerPosition("col"));
//
//    testBoard.updateBoard("player", testBoard.getPlayerPosition("row"), testBoard.getPlayerPosition("col") + 1);
//    testBoard.updateBoard("player", 1, 3);
//    System.out.println("testBoard.toString() after updating player position (col + 1): \n " + testBoard.toString());

    System.out.println("testBoard.doorPosition.values() => " + testBoard.doorPosition.values());

    testBoard.updateBoard("player",
      testBoard.getPlayerPosition("row"),
      testBoard.getPlayerPosition("col") + 1);

    System.out.println(
      "updated playerPosition.values() => " + testBoard.playerPosition.values());

  }

}
