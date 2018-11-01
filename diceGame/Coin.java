package diceGame;
import java.util.Random;
public class Coin {
	Random r;
	public Coin () {
		r = new Random();
	}
	public boolean coinFlip (String coin) {
		if ((coin.toLowerCase() == "heads") && (r.nextInt(2)==0)){
			return true;
		}
		else if ((coin.toLowerCase() == "tails") && (r.nextInt(2)==1)){
			return true;
		}
		else {
			return false;
		}
	}
}
