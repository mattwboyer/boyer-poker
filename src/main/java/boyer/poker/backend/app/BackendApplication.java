package boyer.poker.backend.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import boyer.poker.backend.object.Card;
import boyer.poker.backend.object.Deck;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffleDeck();
		
		for (Card c : deck.getCards()) {
			System.out.println(c.toString());
		}

		// SpringApplication.run(BackendApplication.class, args);
	}
}
