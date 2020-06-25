package com.javaneers.game;


import com.javaneers.boardSquares.Square;
import com.javaneers.boardSquares.SquareFactory;
import com.javaneers.client.GamePlay;

public class PlayerSprite {
  public boolean hasWon = false;
  public boolean hasLost = false;
  public int currentPlayerRow;
  public int currentPlayerCol;
  private int moveCount = 7;

  //CTORS
  public PlayerSprite() {};
  public PlayerSprite(int moveCount) {
    this.moveCount = moveCount;
  }

  //BUSINESS METHODS
  public void movePlayer(Square[][] board) {
    int input;
    int i = getMoveCount();

      // Use this visualization when cheating
      System.out.println("----------------------------------------------------------");
      if (GamePlay.getCheatCode()) {
        System.out.println(SquareFactory.paintBoard(board));
      }

      // Prompt player for move selection
      ConsoleOutput.printMoveSelectionsPrompt();

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

      // player choice is '0' --> EXIT the GAME
      } else if (input == 0) {
        i = 1;
      }
      else {
        ConsoleOutput.printCannotMove(getMoveCount());
      }
      i -= 1;
      setMoveCount(i);
      board[currentPlayerRow][currentPlayerCol].setPlayerHere(true);

      // Begin Resolution Phase of Player's Turn
      resolvePlayerActions(board);
      ConsoleOutput.printMoveCount(getMoveCount());
      if (getMoveCount() == 0) {
        setHasLost(true);
      }
    }

    private void resolvePlayerActions(Square[][] board) {
      var x = board[currentPlayerRow][currentPlayerCol];
      // Check if there is a door or boon at player's position
      if (x.isDoorHere()) {
        setHasWon(true);
      }
      else if (x.isBoonHere()) {
        x.setBoonHere(false);
        setMoveCount(getMoveCount() + 5);
      }
    }

    // GETTERS AND SETTERS
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }

    public int getCurrentPlayerRow() { return this.currentPlayerRow; }
    public void setCurrentPlayerRow(int row) {
      currentPlayerRow = row;
    }

    public int getCurrentPlayerCol() { return this.currentPlayerCol; }
    public void setCurrentPlayerCol(int col) {
      currentPlayerCol = col;
    }

    public boolean getHasWon() {
      return hasWon;
    }
    public void setHasWon(boolean hasWon) {
      this.hasWon = hasWon;
    }

    public boolean getHasLost() {
      return hasLost;
    }
    public void setHasLost(boolean hasLost) {
      this.hasLost = hasLost;
    }

    @Override
    public String toString() { return getClass().getSimpleName() + " Moves left:" + getMoveCount(); }

}
