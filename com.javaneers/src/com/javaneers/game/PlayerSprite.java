package com.javaneers.game;


public class PlayerSprite {

  private int moveCount = 5; //hardcoded here for now
  GameBoard board = new GameBoard();

  //ctors
  public PlayerSprite() {};
  public PlayerSprite(int moveCount) {
    this.moveCount = moveCount;
  }

  //Business Methods
  public void movePlayer() throws IllegalArgumentException {
    int currentRow = board.getPlayerPosition("row");
    int currentCol = board.getPlayerPosition("col");
    int input;
    int i = getMoveCount();

    while (i > 0) {
      input = ReadPlayerInput.getInput();
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
        throw new IllegalArgumentException("You hit a wall, try other direction");
      i -= 1;
      setMoveCount(i);
      board.updateBoard("player", currentRow, currentCol);
      System.out.println("Moves left: " + getMoveCount()); //might be not needed inside movePlayer()
     }
    }

    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }


  @Override
  public String toString() { return getClass().getSimpleName() + " Moves left:" + getMoveCount();}


  }

