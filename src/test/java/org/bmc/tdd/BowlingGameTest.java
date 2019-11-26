package org.bmc.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

    BowlingGame theGame = new BowlingGame();

    @Test
    public void shouldScoreOneWhenRolledOneWithJUnit() {
        assertEquals(1, theGame.getScore());
    }

    @Test
    public void shouldScoreOneWhenRolledOneWithAssertJ() {
        Assertions.assertThat(theGame.getScore()).isEqualTo(1);
    }

}