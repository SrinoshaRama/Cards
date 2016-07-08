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
