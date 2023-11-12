package com.perftop;

public class GuessStatistics {

  public static String getGuessStatisticsMessage(char candidate, int count) {
    String number;
    String verb;
    String pluralModifier;
    if (count == 0) {
      number = "no";
      verb = "are";
      pluralModifier = "s";
    } else if (count == 1) {
      number = "1";
      verb = "is";
      pluralModifier = "";
    } else {
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
    }
    return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
  }
}

