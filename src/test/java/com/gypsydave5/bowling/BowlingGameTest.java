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
        manyRolls(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test public void
    itScoresTwentyOnGamesOfAllOnes() {
        int iterations = 20;
        int pins = 1;
        manyRolls(iterations, pins);
        assertThat(game.score(), is(20));
    }

    private void manyRolls(int iterations, int pins) {
        for (int i = 0; i < iterations; i++) game.roll(pins);
    }


}
