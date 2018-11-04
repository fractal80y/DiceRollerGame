package GameObjects;
import java.util.ArrayList;

public class Player {
	private String playerName;
	private int wallet;
	private int gamesWon;
	private ArrayList<int[]> rollsList;
	
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
	//DONE
	public int[] getRollsListIndex (int i) {
		return this.rollsList.get(i);
	}
	//DONE
	public void clearRollList () {
		this.rollsList.clear();
	}
	
	public ArrayList<int[]> getRollsList() {
		return this.rollsList;
	}
	public int addRolls (int list) {
		int total = 0;
		for (int i = 0;i<getRollsListIndex(list).length;i++){
			total += getRollsListIndex(list)[i];
		}
		return total;
	}
	public String rollString (int list) {
		String total = "";
		for (int i = 0;i<getRollsListIndex(list).length;i++){
			total += (getRollsListIndex(list)[i]+ " ");
		}
		return total;
	}
	//DONE
	public void addRollList (int[] intList) {
		this.rollsList.add(intList);
	}
	//DONE
	public void updateWallet (int cash) {
		this.wallet = this.getWallet() + cash;
	}
	//DONE
	public void updateGamesWon () {
		this.gamesWon++;
	}
	//DONE
	public void resetGamesWon () {
		this.gamesWon = 0;
	}
	//DONE
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	//DONE
	public void setName (String name) {
		this.playerName = name;
	}
}