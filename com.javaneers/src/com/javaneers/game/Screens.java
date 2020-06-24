package com.javaneers.game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Screens {
  private String headerText;
  private Collection<String> header;
  private String bodyText;
  private List<String> menuOptions;

  public Screens(String header, String bodyText, List<String> menuOptions) {
    this.setHeaderText(header);
    this.setBodyText(bodyText);
    this.setMenuOptions(menuOptions);

  }

  public void drawScreen() {
    drawHeader();
    drawBody();
    drawMenu();
  }

  public void drawHeader () {
    Collection<String> headerRows = buildHeader(getHeaderText());
      for (String row :headerRows) {
        System.out.println(row);
    }
    System.out.println("\n");
  }

  private void drawBody(){
    try {
      Files.lines(Path.of("com.javaneers","data",(getBodyText() + ".txt"))).forEach(line -> System.out.println(line));
      System.out.println("\n");
    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void drawMenu () {
    System.out.println(buildMenu(getMenuOptions()));
    System.out.println("\n");
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

  String buildMenu(List<String> menuOptions){
    StringBuilder menu = new StringBuilder();
    for (int i=0; i<menuOptions.size();i++) {
      int expectedInput;
      if ( ! menuOptions.get(i).equals("exit")) {
        expectedInput = i + 1;
      }
      else {
        expectedInput = 0;
      }
      menu.append(" " + menuOptions.get(i) + ": " + expectedInput + " ");
    }
    //Math used for centering Menu Items below Header
    int whitespaces = Math.round(((((headerText.length() + 2) * 8) - menu.length()) / 2));
    for (int i=0; i<whitespaces; i++){
      menu.insert(0," ");
    }
    return menu.toString();
  }



  // Getters Setters
  public String getHeaderText(){ return this.headerText; }
  private Collection<String> getHeader() { return this.header; }
  public String getBodyText(){ return this.bodyText; }
  public List<String> getMenuOptions(){ return this.menuOptions;}

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
  private void setBodyText(String bodyText){ this.bodyText = bodyText; }
  private void setMenuOptions(List<String> options){ this.menuOptions = options;}


}