package com.javaneers.boardSquares;

import java.util.Arrays;

public class SquareFactory {

  public static void main(String[] args) {
    Square[][] testBoard = createBoard();
//    System.out.println(createBoard());
//    System.out.println(testBoard[2][2]);
    System.out.println(paintBoard(testBoard));
  }

  static Square createSquare() {
    return new Square();
  }

  static Square[][] createBoard() {
    Square[][] board = new Square[5][5];
    for (Square[] row : board) {
      for (int i = 0; i < row.length; i++) {
        row[i] = createSquare();
      }
    }
//  spawnDoor();
    board[4][3].setDoorHere(true);
//  spawnPlayer();
    board[2][2].setPlayerHere(true);
//  spawnBoons();
    board[0][4].setBoonHere(true);
    board[4][0].setBoonHere(true);
    return board;
  }

  public static StringBuilder paintBoard(Square[][] currentBoard) {
    StringBuilder result = new StringBuilder("Current board: \n");
    for (Square[] row : currentBoard) {
      result.append(Arrays.toString(row)).append("\n\n");
    }
    return result;
  }

}
