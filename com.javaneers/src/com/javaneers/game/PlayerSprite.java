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

    //move a Player on the GameBoard. Player's Input:  1 = up, 2 =  right, 3 = down, 4 = left
    while (i > 0) {
      System.out.println("----------------------------------------------------------");
      // Prompt player for move selection
      System.out.println("Please choose the direction you'd like to attempt to move: ");
      System.out.println("    1. Move Up");
      System.out.println("    2. Move Right");
      System.out.println("    3. Move Down");
      System.out.println("    4. Move Left \n\n");

      input = ReadPlayerInput.getInput();

      // player choice is '1' --> UP
      if (input == 1 && currentRow != 0) {
        currentRow -= 1;
        System.out.println("You took one step up.");

      // player choice is '2' --> RIGHT
      } else if (input == 2 && currentCol != board.getBoardWidth() - 1) {
        currentCol += 1;
        System.out.println("You took one step right.");

      // player choice is '3' --> DOWN
      } else if (input == 3 && currentRow != board.getBoardHeight() - 1) {
        currentRow += 1;
        System.out.println("You took one step down.");

      // player choice is '4' --> LEFT
      } else if (input == 4 && currentCol != 0) {
        currentCol -= 1;
        System.out.println("You took one step left.");

      }  else
        System.out.println("Oops!  You slam headfirst into the wall. Guess you can't go that way...");

      i -= 1;
      setMoveCount(i);
      board.updateBoard("player", currentRow, currentCol);
      System.out.println("Moves left: " + getMoveCount()); //might be not needed inside movePlayer()
     }
    }
    //check currentPosition if the Player reached the Door or a Boon




    //getters and setters
    public int getMoveCount() { return moveCount; }
    public void setMoveCount(int moveCount) { this.moveCount = moveCount; }


  @Override
  public String toString() { return getClass().getSimpleName() + " Moves left:" + getMoveCount();}


  }

