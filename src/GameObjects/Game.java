package GameObjects;

public class Game {
	private Player player1;
	private Player player2;
	private GameLogic gLog;
	private Dice d;
	
	private int rollNumber;
	private int gameNumber;
	private int roundTotal;
	
	public Game (String name1, String name2, int rollNumber, int gameNumber, int wallet) {
		player1 = new Player (name1, wallet);
		player2 = new Player (name2, wallet);
		d = new Dice ();
		gLog = new GameLogic();
		this.rollNumber = rollNumber;
		this.gameNumber = gameNumber;
		roundTotal = 0;
	}
	public int[] generateRolls () {
		return d.generateRolls(rollNumber);
	}
	public void playerRoll () {
		player1.getRollsList().add(generateRolls());
		player2.getRollsList().add(generateRolls());
		
	}
	public void winChecks (int bet) {
		determineRoundWin(compareInts(player1.addRolls(roundTotal),player2.addRolls(roundTotal)));
		determineMatchWin(bet);
	}
	public void incRoundTotal () {
		roundTotal++;
	}
	public boolean compareInts (int total1, int total2) {
		return gLog.compareInts(total1, total2);	
	}
	public void determineRoundWin (boolean foo) {
		if (foo == true) {
			player1.updateGamesWon();
			incRoundTotal();
		}
		else if (foo == false) {
			player2.updateGamesWon();
			incRoundTotal();
		}
		
	}
	public void determineMatchWin(int bet) {
		double wins = (Math.ceil((double)this.gameNumber/2));
		if (player1.getGamesWon()==((int)Math.ceil(wins))) {
			player1.updateWallet(bet);
			player2.updateWallet(-bet);
			resetGamesWon();
			clearRollList();
		}
		else if (player2.getGamesWon()==((int)Math.ceil(wins))) {
			player1.updateWallet(-bet);
			player2.updateWallet(bet);
			resetGamesWon();
			clearRollList();
		}
		gLog.gameOver(player1.getWallet(), player2.getWallet());
	}
	public void resetGamesWon() {
		player1.resetGamesWon();
		player2.resetGamesWon();
		this.roundTotal = 0;
	}
	public void clearRollList() {
		player1.clearRollList();
		player2.clearRollList();
	}
	public int getMaxRounds() {
		return this.gameNumber;
	}
	public int getCurrentRounds() {
		return this.roundTotal;
	}
	public Player getPlayer1 () {
		return this.player1;
	}
	public Player getPlayer2 () {
		return this.player2;
	}
}