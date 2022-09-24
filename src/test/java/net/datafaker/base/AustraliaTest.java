package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AustraliaTest extends BaseFakerTest {

    @Test
    void locations() {
        assertThat(faker.australia().locations()).isNotEmpty();
    }

    @Test
    void animals() {
        assertThat(faker.australia().animals()).isNotEmpty();
    }

    @Test
    void states() {
        assertThat(faker.australia().states()).isNotEmpty();
    }
}