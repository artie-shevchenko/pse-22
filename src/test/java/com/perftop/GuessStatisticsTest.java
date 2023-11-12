package com.perftop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GuessStatisticsTest {

  GuessStatistics guessStatistics;

  @Before
  public void setUp() {
    guessStatistics = new GuessStatistics();
  }

  @Test
  public void zeroMessage() {
    assertEquals("There are no bs", guessStatistics.getGuessStatisticsMessage('b', 0));
  }

  @Test
  public void oneMessage() {
    assertEquals("There is 1 b", guessStatistics.getGuessStatisticsMessage('b', 1));
  }

  @Test
  public void twoMessage() {
    assertEquals("There are 2 bs", guessStatistics.getGuessStatisticsMessage('b', 2));
  }
}