package WBModel;

import GameObjects.Game;
import GameObjects.Player;

public class GameModel {
	private Game game;
	
	public GameModel (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		this.game = new Game ( name1,  name2,  rollNumber,  gameNumber,  wallet);	
	}
	public void playerRolls() {
		game.playerRoll();
	}
	public void winChecks (int bet) {
		game.winChecks(bet);
	}
	public int getP1Wallet () {
		return game.getPlayer1().getWallet();
	}
	public int getP2Wallet () {
		return game.getPlayer2().getWallet();
	}
	public int getMaxRounds () {
		return game.getMaxRounds();
	}
	public int getCurrentRound() {
		return game.getCurrentRounds();
	}
	public int getP1Total () {
		return game.getPlayer1().addRolls(game.getCurrentRounds());
	}
	public int getP2Total () {
		return game.getPlayer2().addRolls(game.getCurrentRounds());
	}
	public void incRoundTotal () {
		game.incRoundTotal();
	}
	public String getP1RollString () {
		return game.getPlayer1().rollString(game.getCurrentRounds());
	}
	public String getP2RollString () {
		return game.getPlayer1().rollString(game.getCurrentRounds());
	}
	public int getPlayer1GamesWon() {
		return game.getPlayer1().getGamesWon();
	}
	public int getPlayer2GamesWon() {
		return game.getPlayer2().getGamesWon();
	}
}