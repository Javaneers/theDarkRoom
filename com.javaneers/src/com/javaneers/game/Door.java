package com.javaneers.game;

public class Door {

  // PROPERTIES
  public boolean canBeAttempted = true;

  static int spawnLocation (int maxPosition) { return (Math.random() > 0.5) ? maxPosition : 0;
  }

  static boolean coinFlip() {
    return (Math.random() > 0.5);
  }

  // ACCESSORS
  public void setCanBeAttempted() {
    canBeAttempted = !(canBeAttempted);
  }
  public boolean getCanBeAttempted() {
    return canBeAttempted;
  }
}
