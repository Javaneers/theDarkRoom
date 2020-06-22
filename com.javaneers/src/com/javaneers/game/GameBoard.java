package com.javaneers.game;

public class GameBoard {
  // GamePieces
  int freeSpace = 0;
  int door      = 1;
  int player    = 2;
  int boon      = 3;

  // Board Properties (and their default values)
  public static int boardHeight = 5;
  public static int boardWidth = 5;
  int[][] darkRoom = new int[boardHeight][boardWidth];

  // default GamePiece POSITIONS
  int doorPosition = darkRoom[4][3];
  int playerPosition = darkRoom[3][3];
  int boon1Position = darkRoom[0][0];
  int boon2Position =  darkRoom[1][4];

  // GamePiece Status
  int boonCount = 3;

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
    setDoorPosition(4, 3);
    setPlayerPosition(3, 3);
    setBoonCount(3);
//    setBoonPosition();
    System.out.println("TheDarkRoom is ready...");
  }

  /* TODO: implement these methods or a stand-in equivalent for the GamePlay class
  public Door createDoor() { }

  public spawnPlayer() {
    PlayerSprite playerPiece = new PlayerSprite();
    setPlayerPosition();
  }

  public Boon spawnBoon() { }

  public collisionTest() { }

  public void updatePlayerPosition() { }

   */

  public void decrementBoonCount() {
    this.boonCount--;
  }


  // ACCESSORS
  public void setDoorPosition(int a, int b) {
    doorPosition =
    darkRoom[a][b] = 1;
  }
  public int getDoorPosition() { return doorPosition; }

  public void setPlayerPosition(int a, int b) {
    playerPosition = darkRoom[a][b];
    darkRoom[a][b] = 2;
  }
  public int getPlayerPosition() { return playerPosition; }

  /*
  TODO: make dynamic (able to handle 1, 2, or 3 boons) <-- will be based on board HxW
  public void setBoonPosition(int a, int b) {
    boonPosition = darkRoom[a][b];
    darkRoom[a][b] = 3;
  }
  public int getBoonPosition() {
    return boonPosition;
  }
   */

  public void setBoonCount(int boonCount) {
    this.boonCount = boonCount;
  }
  public int getBoonCount() { return boonCount; }

  public static int getBoardHeight() { return boardHeight; }
  public static int getBoardWidth() { return boardWidth; }


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
