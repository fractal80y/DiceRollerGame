package GameObjects;
import java.util.Random;
public class Dice {
	Random r;
	//Constructor
	public Dice () {
		r = new Random();
	}
	//return a random int between 1-6
	public int rollCommandLine () {
		int dice = r.nextInt(6);
		return dice+1;
	}
	//generate a list of random ints in a int[] of specified size
	public int[] generateRolls (int rollNum) {
		int[] newRolls = new int[rollNum];
		for (int i = 0; i<rollNum;i++) {
			newRolls[i] = rollCommandLine();
		}
		return newRolls;
	}
}