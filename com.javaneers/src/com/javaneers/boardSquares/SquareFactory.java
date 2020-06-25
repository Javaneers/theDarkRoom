package com.javaneers.boardSquares;

import com.javaneers.game.ConsoleOutput;
import com.javaneers.game.PlayerSprite;
import java.util.Random;

public class SquareFactory {

  public static int doorSpawn(Square[][] board) {
    return (Math.random() > 0.5) ? (board.length-1) : 0;
  }

  public static int playerSpawn(Square[][] board) {
    Random randInt = new Random();
    return randInt.nextInt(board.length-2) + 1;
  }

  static Square createSquare() {
    return new Square();
  }

  public static Square[][] createBoard(PlayerSprite player) {
    Square[][] board = new Square[5][5];
    for (Square[] row : board) {
      for (int i = 0; i < row.length; i++) {
        row[i] = createSquare();
      }
    }
    // place tokens
    board[doorSpawn(board)][doorSpawn(board)].setDoorHere(true);

    int pRow = playerSpawn(board);
    int pCol = playerSpawn(board);
    board[pRow][pCol].setPlayerHere(true);
    player.setCurrentPlayerRow(pRow);
    player.setCurrentPlayerCol(pCol);

    board[0][4].setBoonHere(true);
    board[4][0].setBoonHere(true);
    return board;
  }

  public static StringBuilder paintBoard(Square[][] currentBoard) {
    ConsoleOutput.printBoardLegend();
    StringBuilder result = new StringBuilder("Current board: \n ").append("----+---+---+---+---\n");
    for (Square[] row : currentBoard) {
      for (int i = 0; i < row.length; i++) {
        result.append("|");
        if (row[i].isDoorHere()) {
          result.append(" D ");
        }
        else if (row[i].isPlayerHere()) {
          result.append("👻 ");
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
