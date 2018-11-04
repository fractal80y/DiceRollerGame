package GameObjects;
import java.util.ArrayList;

public class Player {
	private String playerName;
	private int wallet;
	private int gamesWon;
	private ArrayList<int[]> rollsList;
	//Constructor
	public Player (String name, int wallet) {
		this.playerName = name;
		this.wallet = wallet;
		this.gamesWon = 0;
		this.rollsList = new ArrayList<int[]>();
	}
	//return an integer which represents the value of all numbers in a roll list added together
	public int addRolls (int list) {
		int total = 0;
		for (int i = 0;i<getRollsListIndex(list).length;i++){
			total += getRollsListIndex(list)[i];
		}
		return total;
	}
	//generate a string of the numbers in the supplied list for the UI
	public String rollString (int list) {
		String total = "";
		for (int i = 0;i<getRollsListIndex(list).length;i++){
			total += (getRollsListIndex(list)[i]+ " ");
		}
		return total;
	}
	//Add a list of int[] to the arraylist
	public void addRollList (int[] intList) {
		this.rollsList.add(intList);
	}
	//Get and Set methods :/
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
	public String getName() {
		return this.playerName;
	}
	public int getWallet () {
		return this.wallet;
	}
	public int getGamesWon () {
		return this.gamesWon;
	}
	public void setName (String name) {
		this.playerName = name;
	}
	public ArrayList<int[]> getRollsList() {
		return this.rollsList;
	}
	public void clearRollList () {
		this.rollsList.clear();
	}
	public int[] getRollsListIndex (int i) {
		return this.rollsList.get(i);
	}
}