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
    System.out.println("Board Legend: \n 👻 = player \n B = boon \n D = door");
    StringBuilder result = new StringBuilder("Current board: \n ").append("----+---+---+---+---\n");
    for (Square[] row : currentBoard) {
      for (int i = 0; i < row.length; i++) {
        result.append("|");
        if (row[i].isDoorHere()) {
          result.append(" D ");
        }
        else if (row[i].isPlayerHere()) {
          result.append("👻 ");
//          result.append(" \uD83D\uDE00 ");  // smile
//          result.append(" ").append(Character.toChars(0x1F349)).append(" ");
//          \xF0\x9F\x9A\xBA = "women's symbol"
        }
        else if (row[i].isBoonHere()) {
          result.append(" B ");
        }
        else {
          result.append("   ");
        }
      }
      result.append("|\n----+---+---+---+----\n");
    }
    return result;
  }

}
