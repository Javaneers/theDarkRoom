package com.javaneers.gameSpace;

public class Square {

  // PROPERTIES
  public boolean doorHere;
  public boolean playerHere;
  public boolean boonHere;

  // CTORs
  public Square() {
    // no-arg
  }
  public Square(String token) throws IllegalArgumentException {
    this();
    try {
      if ("door".equals(token)) {
        setDoorHere(true);
      }
      else if ("player".equals(token)) {
        setPlayerHere(true);
      }
      else if ("boon".equals(token)) {
        setBoonHere(true);
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Argument token '" + token + "' is unacceptable.\n" +
        "  The only special tokens allowed are: 'door', 'player', and 'boon'.");
    }
  }

  // ACCESSORS
  public boolean isDoorHere() {
    return doorHere;
  }
  public void setDoorHere(boolean doorHere) {
    this.doorHere = doorHere;
  }

  public boolean isPlayerHere() {
    return playerHere;
  }
  public void setPlayerHere(boolean playerHere) {
    this.playerHere = playerHere;
  }

  public boolean isBoonHere() {
    return boonHere;
  }
  public void setBoonHere(boolean boonHere) {
    this.boonHere = boonHere;
  }

  // Override
  public String toString() {
    return getClass().getSimpleName() + ":" +
      "\n doorHere=" + isDoorHere() +
      "\n playerHere=" + isPlayerHere() +
      "\n boonHere=" + isBoonHere() +
      "";
  }
}
