import java.util.*;
public class Deck {	
	
	private Card[] deck = new Card[52];
	public int cardsInPlay = 0;
	
	Deck(){
		int i = 0;
		for(Rank r : Rank.values()){
			for(Suit s : Suit.values()){
				deck[i++] = (new Card(r,s));
			}
		}
	}
	public Card[] getDeck(){
		return this.deck;
	}
	
	public Card[] getStartingHand(){
		Card[] startingHand = new Card[14];
		for(int i=0; i<13; i++){
			startingHand[i] = deck[i];
			deck[i].setInPlay(true);
		}
		this.cardsInPlay = 13;
		return startingHand;
	}
	
	public Card getTopCard(){
		this.deck[cardsInPlay].setInPlay(true);
	
	public void shuffle(){

		Collections.shuffle(deck);
		}
	}
	public void printDeck(){
		String isInPlay = "";
		for(int i=0; i < this.deck.length; i++){
			if(deck[i].getInPlay()) {
				isInPlay = "in play";}
			else {
				isInPlay = "not in play";}
			
			System.out.println("Card: " + this.deck[i].getRank() + " of " + this.deck[i].getSuit() + " is " + isInPlay); 
		}
	}
}
		
