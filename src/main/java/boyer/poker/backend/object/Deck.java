package boyer.poker.backend.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    private List<Card> cards;

    public Deck() {
        cards = buildDeck();
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public List<Card> shuffleDeck() {
        Collections.shuffle(this.cards);
        return cards;
    }

    public List<Card> buildDeck() {
        cards = new ArrayList<>();

        Suit clubs = new Suit("Clubs");
        Suit diamonds = new Suit("Diamonds");
        Suit hearts = new Suit("Hearts");
        Suit spades = new Suit("Spades");

        Value two = new Value("Two", 2);
        Value three = new Value("Three", 3);
        Value four = new Value("Four", 4);
        Value five = new Value("Five", 5);
        Value six = new Value("Six", 6);
        Value seven = new Value("Seven", 7);
        Value eight = new Value("Eight", 8);
        Value nine = new Value("Nine", 9);
        Value ten = new Value("Ten", 10);
        Value jack = new Value("Jack", 11);
        Value queen = new Value("Queen", 12);
        Value king = new Value("King", 13);
        Value ace = new Value("Ace", 14);

        cards.add(new Card(two, clubs));
        cards.add(new Card(three, clubs));
        cards.add(new Card(four, clubs));
        cards.add(new Card(five, clubs));
        cards.add(new Card(six, clubs));
        cards.add(new Card(seven, clubs));
        cards.add(new Card(eight, clubs));
        cards.add(new Card(nine, clubs));
        cards.add(new Card(ten, clubs));
        cards.add(new Card(jack, clubs));
        cards.add(new Card(queen, clubs));
        cards.add(new Card(king, clubs));
        cards.add(new Card(ace, clubs));

        cards.add(new Card(two, diamonds));
        cards.add(new Card(three, diamonds));
        cards.add(new Card(four, diamonds));
        cards.add(new Card(five, diamonds));
        cards.add(new Card(five, diamonds));
        cards.add(new Card(six, diamonds));
        cards.add(new Card(seven, diamonds));
        cards.add(new Card(eight, diamonds));
        cards.add(new Card(nine, diamonds));
        cards.add(new Card(ten, diamonds));
        cards.add(new Card(jack, diamonds));
        cards.add(new Card(queen, diamonds));
        cards.add(new Card(king, diamonds));
        cards.add(new Card(ace, diamonds));

        cards.add(new Card(two, hearts));
        cards.add(new Card(three, hearts));
        cards.add(new Card(four, hearts));
        cards.add(new Card(five, hearts));
        cards.add(new Card(six, hearts));
        cards.add(new Card(seven, hearts));
        cards.add(new Card(eight, hearts));
        cards.add(new Card(nine, hearts));
        cards.add(new Card(ten, hearts));
        cards.add(new Card(jack, hearts));
        cards.add(new Card(queen, hearts));
        cards.add(new Card(king, hearts));
        cards.add(new Card(ace, hearts));

        cards.add(new Card(two, spades));
        cards.add(new Card(three, spades));
        cards.add(new Card(four, spades));
        cards.add(new Card(five, spades));
        cards.add(new Card(six, spades));
        cards.add(new Card(seven, spades));
        cards.add(new Card(eight, spades));
        cards.add(new Card(nine, spades));
        cards.add(new Card(ten, spades));
        cards.add(new Card(jack, spades));
        cards.add(new Card(queen, spades));
        cards.add(new Card(king, spades));
        cards.add(new Card(ace, spades));

        return cards;
    }
}
