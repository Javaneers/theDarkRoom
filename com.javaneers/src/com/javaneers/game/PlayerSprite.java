package com.javaneers.game;

//the class takes care of methods, which move a Player on the GameBoard

public class PlayerSprite {

  
  private int moveCount = 5; //hardcoded here for now


  public void movePayer() {  //might need to throw an exception
    //throws IllegalArgumentException
    // if ((PlayerInteraction.getInput() == "right" && GameBoard.getPlayerLocation[col] = GameBoard.getBoardWidth())
    //  || (PlayerInteraction.getInput() == "left" && GameBoard.getPlayerLocation[col] = 0)
    //  || (PlayerInteraction.getInput() == "up" && GameBoard.getPlayerLocation[row] = 0)
    //  || (PlayerInteraction.getInput() == "down" && GameBoard.getPlayerLocation[row] = GameBoard.getBoardHeight())
    // throw new IllegalArgumentException("you hit the wall, try other direction")
    //else ....{ do move ... }
    int currentRow = GameBoard.getPlayerLocation[row];
    int currentCol = GameBoard.getPlayerLocation[col];
    int i = getMoveCount();
    while (i > 0) {
      if (PlayerInteraction.getInput() == "right" && GameBoard.getPlayerLocation[col] != GameBoard.getBoardWidth()) {
        currentCol += 1;
      } else if (PlayerInteraction.getInput() == "left" && GameBoard.getPlayerLocation[col] != 0) {
        currentCol -= 1;
      } else if (PlayerInteraction.getInput() == "up" && GameBoard.getPlayerLocation[row] != 0) {
        currentRow -= 1;
      } else if (PlayerInteraction.getInput() == "down" && GameBoard.getPlayerLocation[row] != GameBoard.getBoardHe b bight()) {
        currentRow += 1;
      }
      i -= 1;
      setMoveCount(i);
      GameBoard.setPlayerLocation([currentCol][currentRow]);
    }
  }

    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }
  @Override
  public String toString() { return getClass().getSimpleName() + "Moves left:" + getMoveCount();}



  }

