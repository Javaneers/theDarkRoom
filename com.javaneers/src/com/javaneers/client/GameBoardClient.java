package com.javaneers.client;

import com.javaneers.game.GameBoard;

public class GameBoardClient {

  public static void main(String[] args) {
    GameBoard testBoard = new GameBoard();
    System.out.println(testBoard.toString());

    System.out.println("doorPosition --> " + testBoard.getDoorPosition());
    System.out.println("playerPosition --> " + testBoard.getPlayerPosition());

  }

}
