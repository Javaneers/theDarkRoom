package com.javaneers.game;


import com.javaneers.boardSquares.Square;
import com.javaneers.boardSquares.SquareFactory;
import com.javaneers.client.GamePlay;

import java.util.ArrayList;
import java.util.List;

public class PlayerSprite {
  public int currentPlayerRow;
  public int currentPlayerCol;
  private int moveCount = 5; //hardcoded here for now
//  GameBoard board = new GameBoard();

  //ctors
  public PlayerSprite() {};
  public PlayerSprite(int moveCount) {
    this.moveCount = moveCount;
  }

  //Business Methods
//  public void startTurn() {
//    while (moveCount > 0) {
//      movePlayer();
//    }
//  }

  public void movePlayer(Square[][] board) throws IllegalArgumentException {
    int input;
    int i = getMoveCount();

    while (i > 0) {
      System.out.println("----------------------------------------------------------");
      System.out.println(SquareFactory.paintBoard(board));
      // Prompt player for move selection
      ConsoleOutput.printMoveSelectionsPrompt();

      //System.out.println("To exit the game press 9");

      input = ReadPlayerInput.getInput();
      board[currentPlayerRow][currentPlayerCol].setPlayerHere(false);
      // player choice is '1' --> UP
      if (input == 1 && currentPlayerRow != 0) {
        currentPlayerRow -= 1;
        ConsoleOutput.printMovedUp();

        // player choice is '2' --> RIGHT
      } else if (input == 2 && currentPlayerCol != 5 - 1) {
        currentPlayerCol += 1;
        ConsoleOutput.printMovedRight();

        // player choice is '3' --> DOWN
      } else if (input == 3 && currentPlayerRow != 5 - 1) {
        currentPlayerRow += 1;
        ConsoleOutput.printMovedDown();

        // player choice is '4' --> LEFT
      } else if (input == 4 && currentPlayerCol != 0) {
        currentPlayerCol -= 1;
        ConsoleOutput.printMovedLeft();

        //player choice is '0' --> EXIT the GAME
      } else if (input == 0) {
        i = 1;
      }
      else {
        ConsoleOutput.printCannotMove(getMoveCount());
      }
      i -= 1;
      setMoveCount(i);
//      board.updateBoard("player", currentPlayerRow, currentPlayerCol);
      board[currentPlayerRow][currentPlayerCol].setPlayerHere(true);

//      TODO: revise method call if necessary and uncomment it when method is written to resolve action phase for player turn
//      resolvePlayerActions();
      ConsoleOutput.printMoveCount(getMoveCount());
     }
    }


//    TODO: Finish writing this method to resolve action phase of player's turn
//    private void resolvePlayerActions() {
//    //Check if there is a door or boon at player's position
//
//    //If position contains door, attempt to open it
//
//    //If position contains boon, print a message and setMoveCount(5);
//
//    }



    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }


    public void setCurrentPlayerRow(int row) {
      currentPlayerRow = row;
    }
    public int getCurrentPlayerRow() { return this.currentPlayerRow; }
    public void setCurrentPlayerCol(int col) {
      currentPlayerCol = col;
    }
    public int getCurrentPlayerCol() { return this.currentPlayerCol; }


  @Override
  public String toString() { return getClass().getSimpleName() + " Moves left:" + getMoveCount();}


  }

