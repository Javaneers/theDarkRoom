package com.javaneers.game;

//the class takes care of methods, which move a Player on the GameBoard

public class PlayerSprite { //?extends GameBoard {

<<<<<<< HEAD
  
  private int moveCount = 5; //hardcoded here for now
=======
  int moveCount = 5; //hardcoded here for now
>>>>>>> a9fcbebc783a0bac92a83d9a6401ade216976644


  public void movePayer() throws IllegalArgumentException {
    int currentRow = GameBoard.getPlayerPosition[row];
    int currentCol = GameBoard.getPlayerPosition[col];
    String input = PlayerInteraction.getInput();
    int i = getMoveCount();

    while (i > 0) {
      if (input.equals("right") && currentCol != GameBoard.getBoardWidth()) {
        currentCol += 1;
      } else if (input.equals("left") && currentCol != 0) {
        currentCol -= 1;
      } else if (input.equals("up") && currentRow != 0) {
        currentRow -= 1;
      } else if (input.equals("down") && currentRow != GameBoard.getBoardHeight()) {
        currentRow += 1;

      } else if ((input.equals("right") && currentCol == GameBoard.getBoardWidth())
                || (input.equals("left") && currentCol == 0)
                || (input.equals("up") && currentRow == 0)
                || (input.equals("down") && currentRow == GameBoard.getBoardHeight()))
          throw new IllegalArgumentException("You hit a wall, try other direction. Moves left: " + getMoveCount());
      }
      i -= 1;
      setMoveCount(i);
      GameBoard.setPlayerPosition([currentCol][currentRow]);
    }

    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }
  @Override
  public String toString() { return getClass().getSimpleName() + "Moves left:" + getMoveCount();}



  }

