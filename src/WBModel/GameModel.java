package WBModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GameObjects.Game;
import GameObjects.Player;

public class GameModel {
	private Game game;
	
	//The current bet value for the game that has been returned from the view
	private int betValue;
	
	//Used to determine whether the current selected bet is valid
	private boolean betValid;
	
	public GameModel (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		this.game = new Game ( name1,  name2,  rollNumber,  gameNumber,  wallet);
		this.betValue = 50;
		this.betValid = true;
	}
	//Game operations that are stored in the game class
	public void playerRolls() {
		game.playerRoll();
	}
	//Works fine however it uses logic stored in the game class
	public void winChecks () {
		game.winChecks(betValue);
	}
	// This works with the controller and view for testing of bet values against the player wallet values
	public void checkThatBetIsValid (String bet) throws NumberFormatException {
		//By catching the NumberFormat Exception we are able to pass "All In" value through the logic
		try {
		if (Integer.parseInt(bet) > getP1Wallet() || Integer.parseInt(bet) > getP2Wallet()) {
			this.betValid = false;
			JOptionPane.showMessageDialog(new JFrame(), "Please select a valid betting amount");
		}
		else if (Integer.parseInt(bet) <= getP1Wallet() && Integer.parseInt(bet) <= getP2Wallet()) {
			this.betValid = true;
			betSetter(bet);
		}
		}catch (NumberFormatException e){}
		//This block handles the all in case
		if (String.valueOf(bet) == "All In") {
			this.betValid = true;
			betSetter(bet);
		}
		
	}
	// THis method works with the controller 
	public void betSetter (String bet) {
		if (String.valueOf(bet) == "All In") {
			this.betValue = getLowestPlayerWallet();
		}
		else {
			this.betValue = Integer.parseInt(bet);
		}
	}
	//delegate method to grab the value of the lowest player's wallet
	public int getLowestPlayerWallet () {
		return game.getLowestPlayerWallet();
	}
	//GET AND SET METHODS
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