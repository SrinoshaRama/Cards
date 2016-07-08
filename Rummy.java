import java.util.ArrayList;


public class Rummy {
	ArrayList<Player> players = new ArrayList<Player>();
	final ArrayList<Card> pack = new ArrayList<Card>() {{
		for (int i = 2; i < 52; ++i) {
		add(new Card(i));
		}
		add(new Card(100));
		add(new Card(100));
	}};
	
}
