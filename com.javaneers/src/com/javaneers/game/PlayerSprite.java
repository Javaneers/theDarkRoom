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

      // Prompt player for move selection
      System.out.println("Please choose the direction you'd like to attempt to move: ");
      System.out.println("    1. Move Up");
      System.out.println("    2. Move Right");
      System.out.println("    3. Move Down");
      System.out.println("    4. Move Left \n");

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
        System.out.println("Oops!  You slam headfirst into the wall. Guess you can't go that way...");
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

