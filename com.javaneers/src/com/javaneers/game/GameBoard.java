package com.javaneers.game;

public class GameBoard {

  // Properties (and their default values)
  int height = 5;
  int width = 5;
  int[][] darkRoom = new int[height][width];
  int doorPosition = darkRoom[4][3];
  int playerPosition = darkRoom[3][3];
  int boon1Position = darkRoom[0][0];
  int boon2Position =  darkRoom[1][4];


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

  // TODO: address the creation of gameBoards via external method calls (createBoard should just be "new" GameBoard? or instanceOF? ..?
  // public GameBoard createBoard() { }

  // BUSINESS METHODS
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

  // ACCESSORS


   */

  @Override
  public String toString() {
    var result = new StringBuilder();
    for (int h[] : darkRoom) {
      for (int w : h) {
//        System.out.print(w);
        result.append(w);
      }
//      System.out.println(" ");
      result.append("\n");
    }
    return "theDarkRoom currently looks like this: \n" + result;
  }

}
