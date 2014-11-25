package com.gypsydave5.bowling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BowlingGameTest {

    @Test public void
    itScoresZeroOnGutterGames() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) game.roll(0);
        assertThat(game.score(), is(0));
    }

    @Test public void
    itScoresTwentyOnGamesOfAllOnes() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) game.roll(1);
        assertThat(game.score(), is(20));
    }

}
