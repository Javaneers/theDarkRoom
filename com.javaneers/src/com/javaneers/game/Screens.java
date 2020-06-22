package com.javaneers.game;

import java.util.ArrayList;
import java.util.Collection;

//Possibly interface for display screens
  public class Screens {
  private String header;
  private String paragraph;
  private Collection<String> menuOptions;

  public Screens(String header, String paragraph, Collection<String> menuOptions) {

  }

  private void drawScreen() {
    drawHeader ();
    drawParagraph ();
    drawMenu ();
  }

  private void drawHeader () {
    System.out.println(getHeader());
  }
  private void drawParagraph (){
    System.out.println(getParagraph());
  }
  private void drawMenu () {
    System.out.println(getMenuOptions());
  }

  ArrayList<String> buildHeader(String title){
	//builder header always print a begin spaceBlock, will print up to 10 characters from string input, then stops (use a subList), then always prints a trailing spaceBlock
	//two dimensional array for characters?
    return new ArrayList<>();
  }

  // Getters Setters
  String getHeader(){ return this.header; }
  String getParagraph(){ return this.paragraph; }
  Collection getMenuOptions(){ return this.menuOptions;}
  void setHeader() { }
  void setParagraph(){}
  void setMenuOptions(){}
}


}
