package GameObjects;
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
	
	public int[] generateRolls (int rollNum) {
		int[] newRolls = new int[rollNum];
		for (int i = 0; i<rollNum;i++) {
			newRolls[i] = rollCommandLine();
		}
		return newRolls;
	}
}