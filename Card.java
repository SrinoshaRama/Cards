public class Card {
	char pip;
	char suit;
	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}
	
	public char getPip() {
		return this.pip;
	}
	
	public char getSuit() {
		return this.suit;
	}
}
