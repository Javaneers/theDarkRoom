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
	//builder header always print a begin spaceBlock, will print up to 10 characters from string input, then stops (use a substring), then always prints a trailing spaceBlock
	//two dimensional array for characters?
    Collection<String> result = new ArrayList<>();
    String[] letters = headerText.split("");
    for (int i=0; i<10; i++) {
      StringBuilder currentRow = new StringBuilder();
      //Add a spaceBlock at the beginning of the header
      currentRow.append(AlphaHeader.MAP.get(" ")[i]);
      for (String letter : letters) {
        //for each letter in the letters array, I want to find the row i in the enum and append it
        currentRow.append(AlphaHeader.MAP.get(letter)[i]);
        //Focus on one row, build a string for each row, then print it to console
        //Building row string
       // for (int j = 0; j < 10; j++) {
          //concatenate currentLetter[i] to currentRow;
       // }

      }
      //Add a spaceBlock at the end of the header
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