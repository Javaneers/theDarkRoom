package com.javaneers.game;

//the class takes care of methods, which move a Player on the GameBoard

public class PlayerSprite {

  private int moveCount = 5; //hardcoded here for now
  GameBoard board = new GameBoard();

  //Business Methods
  public void movePayer() throws IllegalArgumentException {
    //int currentRow = board.getPlayerPosition();
    //int currentCol = board.getPlayerPosition( int b);
    int[][] pPosition = board.getPlayerPosition();
    int input = ReadPlayerInput.getInput();
    int i = getMoveCount();

    while (i > 0) {
      if (input.equals(2) && currentCol != GameBoard.getBoardWidth()) {
        currentCol += 1;
        System.out.println("You took one step right.");
      } else if (input.equals(4) && currentCol != 0) {
        currentCol -= 1;
        System.out.println("You took one step left.");
      } else if (input.equals(1) && currentRow != 0) {
        currentRow -= 1;
        System.out.println("You took one step up.");
      } else if (input.equals(3) && currentRow != GameBoard.getBoardHeight()) {
        currentRow += 1;
        System.out.println("You took one step down.");

      } else {
        throw new IllegalArgumentException("You hit a wall, try other direction. Moves left: " + getMoveCount());
      }
      i -= 1;
      setMoveCount(i);
      board.setPlayerPosition(int a, b);

      if (board.getPlayerPosition() == board.getDoorPosition()) {
        System.out.println("Congratulations! you found the DOOR!");
      }
      else {
        System.out.println("Keep moving. You have " + getMoveCount() + " moves left.");
      }
    }
  }


    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }

  @Override
  public String toString() { return getClass().getSimpleName() + "Moves left:" + getMoveCount();}



  }

