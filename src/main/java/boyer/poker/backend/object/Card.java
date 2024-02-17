package boyer.poker.backend.object;

public class Card {
    
    private Value value;
    private Suit suit;

    public Card(final Value value, final Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setValue(final Value value) {
         this.value = value;
    }

    public void setSuit(final Suit suit) {
        this.suit = suit;
    }

    public String toString() {
        return this.value.getName() + " of " + this.suit.getName();
    }
}
