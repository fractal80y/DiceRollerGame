package WBModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GameObjects.Game;
import GameObjects.Player;

public class GameModel {
	private Game game;
	private int betValue;
	// Insert check in the controller to determine if thegame loop is allowed to happen
	private boolean betValid;
	
	public GameModel (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		this.game = new Game ( name1,  name2,  rollNumber,  gameNumber,  wallet);
		this.betValue = 0;
		this.betValid = true;
	}
	public void playerRolls() {
		game.playerRoll();
	}
	// I changed this to use the instance variable so check if this is a source of error
	public void winChecks () {
		game.winChecks(betValue);
	}
	public void checkThatBetIsValid (String bet) throws NumberFormatException {
		try {
		if (Integer.parseInt(bet) > getP1Wallet() || Integer.parseInt(bet) > getP2Wallet()) {
			this.betValid = false;
			// Number 1, not fixed
			JOptionPane.showMessageDialog(new JFrame(), "Please select a valid betting amount");
		}
		else if (Integer.parseInt(bet) <= getP1Wallet() && Integer.parseInt(bet) <= getP2Wallet()) {
			this.betValid = true;
			betSetter(bet);
		}
		}catch (NumberFormatException e){}
		if (String.valueOf(bet) == "All In") {
			this.betValid = true;
			betSetter(bet);
		}
		
	}
	public void betSetter (String bet) {
		//Logic for detecting betvalue including the all in button
		if (String.valueOf(bet) == "All In") {
			this.betValue = getLowestPlayerWallet();
		}
		else {
			this.betValue = Integer.parseInt(bet);
		}
	}
	public int getLowestPlayerWallet () {
		int allInBet = 0;
		if (getP1Wallet() > getP2Wallet()) {
			allInBet = getP2Wallet();
		}
		else if (getP1Wallet() < getP2Wallet()) {
			allInBet = getP1Wallet();
		}
		else {
			allInBet = getP1Wallet();
		}
		return allInBet;
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
	public boolean getValidBool() {
		return this.betValid;
	}
}