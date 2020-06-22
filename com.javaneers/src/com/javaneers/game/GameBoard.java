package com.javaneers.game;

public class GameBoard {
  // GamePieces
  int door = 1;
  int player = 2;
  int boon = 3;
  int boonCount = 3;

  // Board Properties (and their default values)
  int height = 5;
  int width = 5;
  int[][] darkRoom = new int[height][width];

  // GamePiece POSITIONS
  int doorPosition = darkRoom[4][3];
  int playerPosition = darkRoom[3][3];
  int boon1Position = darkRoom[0][0];
  int boon2Position =  darkRoom[1][4];

  // TODO: potentially make these classes
  // Door door = new Door();
  // Player player = new Player();
  // Boon boon = new Boon();

  // CONSTRUCTORS
  public GameBoard() {    // default board --> 5x5
    // no-arg
  }
  public GameBoard(int height, int width) {   // custom board with height & width set at instantiation
    this.darkRoom = new int [height][width];
  }

  // BUSINESS METHODS
  public void setupRoom() {
    setDoorPosition();
    setPlayerPosition();
    setBoons();
    System.out.println("TheDarkRoom is ready...");
  }
  /*
  public Door createDoor() {

  }

  public spawnPlayer() {
    PlayerSprite playerPiece = new PlayerSprite();
    setPlayerPosition();
  }

  public Boon spawnBoon() {

  }

  public collisionTest() {

  }

  public void updatePlayerPosition() {

  }

   */

  // ACCESSORS
  public void setDoorPosition(int a, int b) {
    doorPosition = ;
  }


  @Override
  public String toString() {
    var result = new StringBuilder();
    for (int h[] : darkRoom) {
      for (int w : h) {
//        System.out.print(w);
        result.append(w + " ");
      }
//      System.out.println(" ");
      result.append("\n");
    }
    return "theDarkRoom currently looks like this: \n" + result;
  }

}
