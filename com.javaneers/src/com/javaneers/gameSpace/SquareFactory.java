package com.javaneers.gameSpace;

import java.util.Arrays;

public class SquareFactory {

  public static void main(String[] args) {
    Square[][] testBoard = createBoard();
//    System.out.println(createBoard());
    System.out.println(testBoard[2][2]);
  }

  static Square createSquare() {
    return new Square();
  }

  static Square[][] createBoard() {
    Square[][] board = new Square[5][5];
    for (Square[] row : board) {
      for (int i = 0; i < row.length; i++) {
        row[i] = createSquare();
//        System.out.println(row[i].toString());
      }
    }
    return board;
  }

}


/*
 * Replace int with Square.
 */
//class AgeFactory {
//
//  static int[][] createAges() {
//    int[][] ages = new int[5][5];
//    for (int[] row : ages) {
//      for(int i = 0; i < row.length; i++) {
//        row[i] = (int) (Math.random() * 100);
//      }
//    }
//    return ages;
//  }
//}