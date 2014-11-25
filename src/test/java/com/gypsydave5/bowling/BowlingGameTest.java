package com.gypsydave5.bowling;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BowlingGameTest {

    Game game;

    @Before public void
    setUpGame() {
        game = new Game();
    }

    @Test public void
    itScoresZeroOnGutterGames() {
        rollMany(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test public void
    itScoresTwentyOnGamesOfAllOnes() {
        rollMany(20, 1);
        assertThat(game.score(), is(20));
    }

    @Test public void
    itKnowsHowToScoreOneSpare() {
        rollSpare();
        game.roll(4);
        rollMany(17, 0);
        assertThat(game.score(), is(18));
    }

    @Test public void
    itKnowsHowToScoreAStrike() {
        rollStrike();
        game.roll(2);
        game.roll(3);
        rollMany(17, 0);
        assertThat(game.score(), is(20));
    }

    @Test public void
    itKnowsHowToScoreAPerfectGame() {
        rollMany(12, 10);
        assertThat(game.score(), is(300));
    }

    private void rollMany(int iterations, int pins) {
        for (int i = 0; i < iterations; i++) game.roll(pins);
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }


}

