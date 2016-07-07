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
	
	public String compareTo(Card obj) {
		if ("CDHS".indexOf(this.suit) * 13 + "23456789TJQKA".indexOf(this.pip) > "CDHS".indexOf(obj.suit) 					* 13 + "23456789TJQKA".indexOf(obj.pip)) {
			return "greater";
		} else {
			return "smaller";
		}
	}
}
