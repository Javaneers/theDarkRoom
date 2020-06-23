package com.javaneers.game;

//the class takes care of methods, which move a Player on the GameBoard

public class PlayerSprite {

  private int moveCount = 5; //hardcoded here for now
  GameBoard board = new GameBoard();

  //Business Methods
  public void movePayer() throws IllegalArgumentException {
    int currentRow = 3; //board.getPlayerPosition("row");
    int currentCol = 4; //board.getPlayerPosition("col");
    int input = PlayerInput.getInput();
    int i = getMoveCount();

    while (i > 0) {
      if (input == 2 && currentCol != board.getBoardWidth()) {
        currentCol += 1;
        System.out.println("You took one step right.");
      } else if (input == 4 && currentCol != 0) {
        currentCol -= 1;
        System.out.println("You took one step left.");
      } else if (input == 1 && currentRow != 0) {
        currentRow -= 1;
        System.out.println("You took one step up.");
      } else if (input == 3 && currentRow != board.getBoardHeight()) {
        currentRow += 1;
        System.out.println("You took one step down.");

      } else
        throw new IllegalArgumentException("You hit a wall, try other direction. Moves left: " + getMoveCount());
      }
      i -= 1;
      setMoveCount(i);
      board.setPlayerPosition(...); //

      if (board.getPlayerPosition() == board.getDoorPosition()) {
        System.out.println("Congratulations! you found the DOOR!");
      }
      else {
        System.out.println("Keep moving. You have " + getMoveCount() + " moves left.");
      }
    }


    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }

  @Override
  public String toString() { return getClass().getSimpleName() + "Moves left:" + getMoveCount();}



  }

