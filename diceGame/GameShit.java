package diceGame;
import java.util.Scanner;
import java.math.*;
public class GameShit {
	Player player1;
	Player player2;
	Dice d;
	int rollNumber;
	int gameNumber;
	Scanner s;
	Coin c;
	boolean roundWinner;
	public GameShit () {
		// Creation of the objects for the game will be handled within the GUI
		s = new Scanner(System.in);
		c = new Coin();
		System.out.println("Enter Player 1's name: \n");
		player1 = new Player(s.nextLine());
		System.out.println("Enter Player 2's name); \n");
		player2 = new Player(s.nextLine());
		d = new Dice();
		System.out.println("Enter an integer between 1 and 5 to specify number of dice to be rolled per round");
		this.rollNumber = Integer.parseInt(s.nextLine());
		System.out.println("Enter an odd integer between 1 and 7 to the number of rounds to play");
		this.gameNumber = Integer.parseInt(s.nextLine());
	}
	
	public int[] generateRolls () {
		int[] newRolls = new int[this.rollNumber];
		for (int i = 0; i<this.rollNumber;i++) {
			newRolls[i] = d.rollCommandLine();
		}
		return newRolls;
	}
	public void walletTest () {
		if (player1.getWallet()<=0) {
			System.out.println("Player 1's wallet has reached 0\n Player 2 is victorious!");
		}
		else if (player2.getWallet()<=0) {
			System.out.println("Player 2's wallet has reached 0\n Player 1 is victorious!");
		}
	}
	public void walletUpdater (int betAmount, boolean game) {
		if(game==true){
			player1.updateWallet(betAmount);
			player2.updateWallet((-betAmount));
		}
		else if (game == false) {
			player1.updateWallet((-betAmount));
			player2.updateWallet(betAmount);
		}
	}
	public void betLoop () {
		while ((player1.getWallet()!= 0) && (player2.getWallet()!=0)){
			System.out.println("Agree on a bet amount (Recommended = 50");
			int betAmount = s.nextInt();
			System.out.println("Press enter to roll");
			s.nextLine();
			
			boolean game = this.gameLoop();
			this.walletTest();
			this.walletUpdater(betAmount, game);
			
			System.out.println("Player 1 has $" + player1.getWallet() +" remaining");
			System.out.println("Player 2 has $" + player2.getWallet() +" remaining");
		}
		System.out.println("Game over");
	}
	public boolean gameLoop () {
		int i = 0;
		
		while (i<this.gameNumber) {
			System.out.println("Press enter to roll");
			s.nextLine();
			player1.addRollList(this.generateRolls());
			player2.addRollList(this.generateRolls());
			this.winRoundLogic(i);
			if (this.winGameLogic() == true) {
				break;
			}
			i++;
		}
		return roundWinner;
	}
	public int addRollList (Player p, int roundNum) {
		int total=0;
		for (int i = 0; i< p.getRollsListIndex(roundNum).length;i++){
			total += p.getRollsListIndex(roundNum)[i];
		}
		return total;
	
	}
	public boolean winGameLogic () {
		//Check that player rounds won is equal to half of the total rounds, rounded up. If true then that player wins
		double f = (double)this.gameNumber/2;
		if (player1.getGamesWon()==(int)Math.ceil(f)){
			System.out.println("Player 1 wins the game!");
			this.roundWinner = true;
			return true;
		}
		if (player2.getGamesWon()==(int)Math.ceil(f)) {
			System.out.println("Player 2 wins the game!");
			this.roundWinner = false;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void winRoundLogic (int i) {
		int p1total = this.addRollList(player1, i);
		int p2total = this.addRollList(player2, i);
		if (p1total > p2total) {
			System.out.println("Player 1 scored " +p1total);
			System.out.println("Player 2 scored " +p2total);
			System.out.println("Player 1 Wins the round");
			player1.updateGamesWon();
		}
		else if (p1total < p2total){
			System.out.println("Player 1 scored " +p1total);
			System.out.println("Player 2 scored " +p2total);
			System.out.println("Player 2 Wins the round");
			player2.updateGamesWon();
		}
		else if (p1total == p2total) {
			System.out.println("It's a tie!\nPlayer 1 calls the coin toss. Please enter 'heads' or 'tails':");
			String coin = s.nextLine();
			if (c.coinFlip(coin) == true) {
				System.out.println("Player 1 wins the toss, and thus the round too!");
				player1.updateGamesWon();
			}
			else if (c.coinFlip(coin) == false) {
				System.out.println("Player 2 wins the toss, and thus the round too!");
				player2.updateGamesWon();
			}
		}
	}
}
