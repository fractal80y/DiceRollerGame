package gameWIndow;

import diceGame.Dice;
import diceGame.Player;

public class Game {
	private Player player1;
	private Player player2;
	private GameLogic gLog;
	private Dice d;
	
	private int rollNumber;
	private int gameNumber;
	
	public Game (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		player1 = new Player (name1,wallet);
		player2 = new Player (name2, wallet);
		d = new Dice ();
		gLog = new GameLogic();
		rollNumber = 1;
		gameNumber = 1;
	}
	public int[] generateRolls () {
		int[] newRolls = new int[this.rollNumber];
		for (int i = 0; i<this.rollNumber;i++) {
			newRolls[i] = d.rollCommandLine();
		}
		return newRolls;
	}
	public void playerRoll () {
		player1.getRollsList().add(generateRolls());
		player2.getRollsList().add(generateRolls());
	}
	public void incGame () {
		gameNumber++;
	}
}
