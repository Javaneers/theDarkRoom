package com.javaneers.game;

import java.util.ArrayList;
import java.util.Collection;

//Possibly interface for display screens
public class Screens {
  private String headerText;
  private Collection<String> header;
  private String paragraph;
  private Collection<String> menuOptions;

  public Screens(String header, String paragraph, Collection<String> menuOptions) {
    this.setHeaderText(header);

  }

  private void drawScreen() {
    drawHeader ();
    drawParagraph ();
    drawMenu ();
  }

  public void drawHeader () {
    Collection<String> headerRows = buildHeader(getHeaderText());
      for (String row :headerRows) {
        System.out.println(row);
      }
  }

  private void drawParagraph (){
    System.out.println(getParagraph());
  }

  private void drawMenu () {
    System.out.println(getMenuOptions());
  }

  Collection<String> buildHeader(String headerText){
	// References a map of alphabetical characters and builds/prints a pixel-style header row by row
    Collection<String> result = new ArrayList<>();
    String[] letters = headerText.split("");
    for (int i=0; i<10; i++) {
      StringBuilder currentRow = new StringBuilder();
      //Add a "whitespace" block at the beginning of the header
      currentRow.append(AlphaHeader.MAP.get(" ")[i]);
      for (String letter : letters) {
        currentRow.append(AlphaHeader.MAP.get(letter)[i]);
      }
      //Add a "whitespace" block at the end of the header
      currentRow.append(AlphaHeader.MAP.get(" ")[i]);
      //Add currentRow to results ArrayList
      result.add(currentRow.toString());
    }
    return result;
  }



  // Getters Setters
  private String getHeaderText(){ return this.headerText; }
  private Collection<String> getHeader() { return this.header; }
  private String getParagraph(){ return this.paragraph; }
  private Collection<String> getMenuOptions(){ return this.menuOptions;}

  private void setHeaderText(String headerText) {
    String result;
    //limit header text to <=10 characters
    if (headerText.length() >= 10){
      result = headerText.substring(0,10);
    }
    else {
      result = headerText;
    }
    this.headerText = result.toLowerCase();
  }
  private void setParagraph(){}
  private void setMenuOptions(){}


}