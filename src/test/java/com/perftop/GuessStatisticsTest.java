package com.perftop;

import static com.perftop.GuessStatistics.getGuessStatisticsMessage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessStatisticsTest {

  @Test
  public void zeroMessage() {
    assertEquals("There are no bs", getGuessStatisticsMessage('b', 0));
  }

  @Test
  public void oneMessage() {
    assertEquals("There is 1 b", getGuessStatisticsMessage('b', 1));
  }

  @Test
  public void twoMessage() {
    assertEquals("There are 2 bs", getGuessStatisticsMessage('b', 2));
  }
}