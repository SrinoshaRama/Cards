import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Player(ArrayList<Card> cards) {
		this.cards.addAll(cards);
	}
	
}

