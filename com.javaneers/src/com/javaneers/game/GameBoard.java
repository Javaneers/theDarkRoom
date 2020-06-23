package com.javaneers.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String, Integer> doorPosition = new HashMap<>() {
    {
      put("row", 3);
      put("col", 3);
    }
  };
  public Map<String, Integer> playerPosition = new HashMap<>() {
    {
      put("row", 3);
      put("col", 4);
    }
  };
//  public Map<String, Integer> boons = new HashMap<>() {
//    {
//      put("boon1", )
//    }
//  };

  // GamePiece Status
  int boonCount = 3;
  boolean doorAttemptable = true;

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



//    int random = x-((int)Math.round((Math.random())*(x-y)));

  // TODO: make a random Class to perform this
  public int randomInt(int min, int max) {
    return max - ((int)Math.round((Math.random())*(max-min)));
  }

  // BUSINESS METHODS
  public void setupBoard() {
    updateBoard("player", randomInt(0, boardHeight - 1), randomInt(0, boardWidth - 1));
    updateBoard("door", randomInt(0, 1), randomInt(0, 1));
    System.out.println("TheDarkRoom is ready...");
  }


  public void updateBoard(String gamePiece, int row, int col) {
    try {
      if ("player".equals(gamePiece)) {
        setPlayerPosition(row, col);
      }
      else if ("door".equals(gamePiece)) {
        setDoorPosition(row, col);
      }
      else if ("boon".equals(gamePiece)) {
//        setBoonPosition();
//        totalBoonCheck();
      }
    } catch (Exception e) {
      System.out.println("Invalid updateBoard parameters, " +
        "please ensure gamePiece argument is: 'player', 'door', or 'boon'");
    }
    finally {
      System.out.println("Updating " + gamePiece +
        " position to row: " + row + ", col: " + col);
    }
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
  public void setDoorPosition(int row, int col) {
    darkRoom[row][col] = 1;
    doorPosition.put("row", row);
    doorPosition.put("col", col);
  }
  public Map<String, Integer> getDoorPosition() { return doorPosition; }

  public void setPlayerPosition(int row, int col) {
    darkRoom[row][col] = 2;
    darkRoom[getPlayerPosition("row")][getPlayerPosition("col")] = 0;
    playerPosition.put("row", row);
    playerPosition.put("col", col);
  }
  public StringBuilder getPlayerPosition() {
    StringBuilder result = new StringBuilder();
    result.append("\n  row: ").append(playerPosition.get("row"));
    result.append("\n  col: ").append(playerPosition.get("col"));
    return result;
  }
  public int getPlayerPosition(String rowOrCol) {
    int result = 404;
    try {
      if ("row".equals(rowOrCol)) {
        result = playerPosition.get("row");
      }
      else if ("col".equals(rowOrCol)) {
        result = playerPosition.get("col");
      }
    } catch (Exception e) {
      System.out.println("Error + " + result +
        "'" + rowOrCol + "' is an invalid getRequest on playPosition." +
        "Please indicate 'row' or 'col'");
    }
    return result;
  }

  /*
  TODO: [STRETCH] make dynamic (able to handle 1, 2, or 3 boons) <-- will be based on board HxW
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
        result.append(w).append(" ");
      }
//      System.out.println(" ");
      result.append("\n");
    }
    System.out.println(Arrays.deepToString(darkRoom));
    return "theDarkRoom currently looks like this: \n" + result;
  }

}
