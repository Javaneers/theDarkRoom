package com.javaneers.game;

public class Door {

  // PROPERTIES
  public boolean canBeAttempted = true;

  static int spawnLocation (int maxPosition) {
    return coinFlip() ? maxPosition : 0;
  }

  static boolean coinFlip() {
    boolean result = false;
    int randNum = (int) Math.floor(Math.random() * Math.random() * 100);
    if (randNum % 2 == 0) {
      result = true;
    }
    return result;
  }

  // ACCESSORS
  public void setCanBeAttempted() {
    canBeAttempted = !(canBeAttempted);
  }
  public boolean getCanBeAttempted() {
    return canBeAttempted;
  }
}
