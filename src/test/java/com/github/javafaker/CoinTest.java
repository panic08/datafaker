package com.github.javafaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;

import org.junit.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}