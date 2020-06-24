package com.javaneers.game;


public class PlayerSprite {

  private int moveCount = 5; //hardcoded here for now
//  GameBoard board = new GameBoard();

  //ctors
  public PlayerSprite() {};
  public PlayerSprite(int moveCount) {
    this.moveCount = moveCount;
  }

  //Business Methods
  public void movePlayer(GameBoard board) throws IllegalArgumentException {
    int currentRow;
    int currentCol;
    int input;
    int i = getMoveCount();

    while (i > 0) {

       currentRow = board.getPlayerPosition("row");
       currentCol = board.getPlayerPosition("col");

      System.out.println("----------------------------------------------------------");
      // Prompt player for move selection
      ConsoleOutput.printMoveSelectionsPrompt();

      input = ReadPlayerInput.getInput();

      // player choice is '1' --> UP
      if (input == 1 && currentRow != 0) {
        currentRow -= 1;
        ConsoleOutput.printMovedUp();

      // player choice is '2' --> RIGHT
      } else if (input == 2 && currentCol != board.getBoardWidth() - 1) {
        currentCol += 1;
        ConsoleOutput.printMovedRight();

      // player choice is '3' --> DOWN
      } else if (input == 3 && currentRow != board.getBoardHeight() - 1) {
        currentRow += 1;
        ConsoleOutput.printMovedDown();

      // player choice is '4' --> LEFT
      } else if (input == 4 && currentCol != 0) {
        currentCol -= 1;
        ConsoleOutput.printMovedLeft();

      }  else
        ConsoleOutput.printCannotMove(getMoveCount());

      i -= 1;
      setMoveCount(i);
      board.updateBoard("player", currentRow, currentCol);
      ConsoleOutput.printMoveCount(getMoveCount()); //might be not needed inside movePlayer()
     }
    }

    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }


  @Override
  public String toString() { return getClass().getSimpleName() + " Moves left:" + getMoveCount();}


  }

