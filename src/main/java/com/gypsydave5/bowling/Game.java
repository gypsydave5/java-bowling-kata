package com.gypsydave5.bowling;

/**
 * Created by gypsydave5 on 25/11/14.
 */
public class Game {

    int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
