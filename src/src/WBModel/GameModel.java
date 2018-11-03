package WBModel;

import GameObjects.Game;
import GameObjects.Player;

public class GameModel {
	private Player p1;
	private Player p2;
	private Game game;
	
	
	public GameModel (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		this.game = new Game ( name1,  name2,  rollNumber,  gameNumber,  wallet);	
	}
	public void playerRolls(int betAmt) {
		game.playerRoll(betAmt);
	}
	public int getP1Wallet () {
		return game.getP1Wal();
	}
	public int getP2Wallet () {
		return game.getP2Wal();
	}
	public int getMaxRounds () {
		return game.getMaxRounds();
	}
	public int getCurrentRound() {
		return game.getCurrentRounds();
	}
}