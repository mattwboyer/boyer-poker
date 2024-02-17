package boyer.poker.backend.enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SuitTest {
    
    @Test
    void correctNumberOfSuits() {
        assertEquals(4, Suit.values().length);
    }

    @Test
    void correctSuits() {
        Object[] values = Suit.values();

        assertEquals("CLUBS", values[0].toString());
        assertEquals("DIAMONDS", values[1].toString());
        assertEquals("HEARTS", values[2].toString());
        assertEquals("SPADES", values[3].toString());
    }
}
