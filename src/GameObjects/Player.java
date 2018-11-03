package GameObjects;
import java.util.ArrayList;

public class Player {
	private String playerName;
	private int wallet;
	private int gamesWon;
	private ArrayList<int[]> rollsList;
	
	public Player (String name) {
		this.playerName = name;
		this.wallet = 1000;
		this.gamesWon = 0;
		this.rollsList = new ArrayList<int[]>();
	}
	public Player (String name, int wallet) {
		this.playerName = name;
		this.wallet = wallet;
		this.gamesWon = 0;
		this.rollsList = new ArrayList<int[]>();
	}
	public String getName() {
		return this.playerName;
	}
	public int getWallet () {
		return this.wallet;
	}
	public int getGamesWon () {
		return this.gamesWon;
	}
	public int[] getRollsListIndex (int i) {
		return this.rollsList.get(i);
	}
	
	public void clearRollList () {
		this.rollsList.clear();
		
	}
	public ArrayList<int[]> getRollsList() {
		return this.rollsList;
	}
	public void addRollList (int[] intList) {
		this.rollsList.add(intList);
	}
	public void updateWallet (int cash) {
		this.wallet = this.getWallet() + cash;
	}
	public void updateGamesWon () {
		this.gamesWon++;
	}
	public void resetGamesWon () {
		this.gamesWon = 0;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}	
}