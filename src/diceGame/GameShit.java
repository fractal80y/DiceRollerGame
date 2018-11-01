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
	public GameShit () {
		//Constructing functional objects
		s = new Scanner(System.in);
		c = new Coin();
		d = new Dice();
		
		//constructing Player Objects
		System.out.println("Enter Player 1's name: \n");
		player1 = new Player(s.nextLine());
		System.out.println("Enter Player 2's name); \n");
		player2 = new Player(s.nextLine());
		
		// Setting game parameters
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
	public void gameLoop () {
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
			return true;
		}
		if (player2.getGamesWon()==(int)Math.ceil(f)) {
			System.out.println("Player 2 wins the game!");
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
			System.out.println(player1.getName() +" scored " +p1total);
			System.out.println(player2.getName()+" scored " +p2total);
			System.out.println(player1.getName()+" Wins the round");
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