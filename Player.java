import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Player(ArrayList<Card> cards) {
		this.cards.addAll(cards);
	}
	
	public  boolean checkPureSequence() {
		Collections.sort(cards, new Comparator<Card>() {
			   public int compare(Card c1, Card c2) {
			      if (c1.seq > c2.seq) {
			    	  return 1;
			      } else if (c1.seq < c2.seq) {
			    	  return -1;
			      }
			      return 0;
			   }
			});
		
		boolean s1 = false;
		boolean s2 = false;
		boolean s3 = false;
		boolean s4= false;
		for (Card crd :cards) {
		if (crd.seq == 0)
			s1 = true;
		if (crd.seq == 13)
			s2 = true;
		if (crd.seq == 26)
			s3 = true;
		if (crd.seq == 39)
			s4 = true;
		}
		
		for(int i = 1; i < cards.size(); ++i) {
			
			if ((cards.get(i).seq - cards.get(i - 1).seq == 1) && ((cards.get(i).seq <= 12 && cards.get(i - 1).seq >= 0) || (cards.get(i).seq <= 25 && cards.get(i - 1).seq >= 13) || (cards.get(i).seq <= 38 && cards.get(i - 1).seq >= 26) || (cards.get(i).seq <= 51 && cards.get(i - 1).seq >= 39))) {
				if ((cards.get(i + 1).seq - cards.get(i).seq == 1) && ((cards.get(i + 1).seq <= 12 && cards.get(i).seq >= 0) || (cards.get(i + 1).seq <= 25 && cards.get(i).seq >= 13) || (cards.get(i + 1).seq <= 38 && cards.get(i).seq >= 26) || (cards.get(i + 1).seq <= 51 && cards.get(i).seq >= 39)))  {
					return true;
				}
				if(cards.get(i).seq == 12 && s1) {
					return true;
				}
				if(cards.get(i).seq == 25 && s2) {
					return true;
				}
				if(cards.get(i).seq == 38 && s3) {
					return true;
				}
				if(cards.get(i).seq == 51 && s4) {
					return true;
				}
			}
		}
		return false;
	}
}

