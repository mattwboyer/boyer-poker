package boyer.poker.backend.object;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    
    List<Card> cards = null;

    public Hand(final Card cardOne, final Card cardTwo) {
        cards = new ArrayList<>();
        
        cards.add(cardOne);
        cards.add(cardTwo);
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return this.cards;
    }
}
