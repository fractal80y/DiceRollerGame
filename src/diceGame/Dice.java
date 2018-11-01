package diceGame;
import java.util.Random;
public class Dice {
	Random r;
	
	public Dice () {
		r = new Random();
	}
	public int rollCommandLine () {
		int dice = r.nextInt(6);
		return dice+1;
	}
}