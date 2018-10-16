package gamePackage;
import java.util.ArrayList;
import java.util.Arrays;
public class Game {
	private int rollNumber;
	private int gameLength;
	private Dice d;
	private ArrayList<int[]> gameList = new ArrayList<int[]> ();
	public Game () {
		this.rollNumber =2;
		this.gameLength = 3;
		d = new Dice();
	}
	public void gameLoop (int gameLength, int rollNum) {
		
		for (int i = 0; i<gameLength; i++) {
			this.getGameList().add(this.rollLoop(rollNum));
		}
	}
	public void gameLoop () {
		for (int i = 0; i<this.getGameLength(); i++) {
			this.getGameList().add(this.rollLoop(this.getRollNumber()));
		}
	}
	public int[] rollLoop(int rollNum) {
		int[] rollList = new int[rollNum];
		for(int i =0;i<rollNum;i++) {
			rollList[i] = d.rollCommandLine();
		}
		return rollList;
		
	}
	public int getRollNumber () {
		return this.rollNumber;
	}
	public int getGameLength () {
		return this.gameLength;
	}
	public ArrayList<int[]> getGameList () {
		return this.gameList;
	}
	public static void main( String[] args) {
		Game g = new Game();
		g.gameLoop();
		System.out.print(Arrays.toString(g.getGameList()));
		
	}
}
