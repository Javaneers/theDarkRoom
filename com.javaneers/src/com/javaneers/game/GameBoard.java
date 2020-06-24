package com.javaneers.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// init doorImplementation branch
public class GameBoard {
  // GamePieces
  private int freeSpace = 0;
  private int door      = 1;
  private int player    = 2;
  private int boon      = 3;

  // GamePiece location designators
  private StringBuilder doorHash = new StringBuilder("Door position not yet set");
  private StringBuilder playerHash = new StringBuilder("Player position not yet set");

  // Board Properties (and their default values)
  int boardHeight = 5;
  int boardWidth = 5;

  // TODO: remove this after ALPHA-version complete & before beta-version
  // HARDCODED FOR TESTING PURPOSES
  int[][] darkRoom = new int[boardHeight][boardWidth];

  // default GamePiece POSITIONS
  public Map<String, Integer> doorPosition = new HashMap<>() {
    {
      put("row", 0);
      put("col", 0);
    }
  };
  public Map<String, Integer> playerPosition = new HashMap<>() {
    {
      put("row", 2);
      put("col", 2);
    }
  };
  // TODO: implement boons (either via Class or collection)
//  public Map<String, Integer> boons = new HashMap<>() {
//    {
//      put("boon1row", 0);
//      put("boon1col", 2);
//    }
//  };

  // GamePiece Status
  int boonCount = 3;
  boolean doorCanBeAttempted = true;

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


  // TODO: make a Class to perform this (potentially named RandomInt)
  public int randomInt(int min, int max) {
    return max - ((int)Math.round((Math.random())*(max-min)));
  }

  // BUSINESS METHODS
  public void setupBoard() {
    // TODO: decide if this method generates a board on this line or if gameplay generates a 'new' board
    updateBoard("player", randomInt(0, getBoardHeight() - 1), randomInt(0, getBoardWidth() - 1));
    updateBoard("door", Door.spawnLocation(getBoardHeight()), Door.spawnLocation(getBoardWidth()) );
    System.out.println("Your Dark Room awaits..");
  }

  public void updateBoard(String gamePiece, int row, int col) {
    try {
      if ("player".equals(gamePiece)) {
        setPlayerPosition(row, col);
      }
//      else if ("door".equals(gamePiece)) {
//        setDoorPosition(row, col);
//      }
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

  public void decrementBoonCount() {
    this.boonCount--;
  }

  public StringBuilder updateHash(int row, int col) {
    return new StringBuilder("r").append(row).append("c").append(col);
  }

  // ACCESSORS
  public void setDoorPosition(int row, int col) {
    doorPosition.put("row", row);
    doorPosition.put("col", col);
    doorHash.delete(0, doorHash.length()).append(updateHash(row, col));
  }
  public Map<String, Integer> getDoorPosition() { return doorPosition; }
  public StringBuilder getDoorHash() { return doorHash; }

  public void setPlayerPosition(int row, int col) {
    playerPosition.put("row", row);
    playerPosition.put("col", col);
    StringBuilder updatedPlayerHash = new StringBuilder("r").append(row).append("c").append(col);
    playerHash = updateHash(row, col);
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
  public StringBuilder getPlayerHash() { return playerHash; }

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

  public int getBoardHeight() { return boardHeight; }
  public int getBoardWidth() { return boardWidth; }

  // TODO: [STRETCH GOAL] implement a method which paints the board (aka darkRoom), taking args of playPosition, doorPosition, and boonPosition
  @Override
  public String toString() {
    /*
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
    */
    return "Current DarkRoom stats: " +
      "  \n playerPosition=" + getPlayerPosition() +
      ", \n doorPosition=" + getDoorPosition() +
//      ", \n  boonsLeftToFind=" + getBoonCount() +
//      ", \n  playerCollectedBoons=" + getCollectedBoons() +
//      ", \n  boonPositions=" + getBoonPositions()
      "";
  }

}
