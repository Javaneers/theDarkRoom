package com.javaneers.tokens;

import java.util.HashMap;
import java.util.Map;

public interface OLD_Token {
  // PROPERTIES
  StringBuilder locationHash = new StringBuilder();
  Boolean status = true;
  Map<String, Integer> positionMap = new HashMap<>() {
    {
      put("row", 0);
      put("col", 0);
    }
  };

  // CTORs
  // special ctor rule is enough here as no generic Token should be instantiated

  // BUSINESS METHODS
  // ??

  // ACCESSORS
  void setStatus();

  getStatus();

  setLocation();

  getLocation();

  getLocationHash();

}
