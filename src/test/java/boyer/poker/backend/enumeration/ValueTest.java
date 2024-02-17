package boyer.poker.backend.enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ValueTest {

    @Test
    void correctNumberOfValues() {
        assertEquals(13, Value.values().length);
    }

    @Test
    void getters() {
        assertEquals("Ace", Value.ACE.getName());
        assertEquals(14, Value.ACE.getValue());
    }
}
