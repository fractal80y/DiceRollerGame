package GameObjects;

import javax.swing.*;

public class GameLogic {
	public GameLogic() {
		
	}
	//Lambda Block Expression, using Interface to bind function to variable
	interface CoinFlip{
		public boolean flipIt();
	}
	
	//Lambda Coin toss
	CoinFlip toss = () -> {
		byte x;
		 x =(byte) Math.round(Math.random());
		  
		  return  (x == 1) ? true : false;   
	};
	// Add NEW GAME FUNCTIONALITY IN THIS METHOD with the JDIALOG MULTIPLE OPTIONS THING WE USED
	public void gameOver(int player1Wallet, int player2Wallet) {
		if(player1Wallet <=0) {
			JOptionPane.showMessageDialog(new JFrame(), "Player 2 Wins.");
			System.exit(0);
		}
			
		else if(player2Wallet <= 0) {
			JOptionPane.showMessageDialog(new JFrame(), "Player 1 Wins.");
			System.exit(0);
		}	
	}
	//This handles the coin flip functionality in the game loop
	public boolean compareInts(int num1,int num2) {
		boolean comp = false;
		if (num1>num2) {
			comp = true;
		}
		else if (num1<num2){
			comp = false;
		}
		else { 
			if(toss.flipIt() == getHeadOrTail(headOrTailDialog())) {
				comp=true; 
				JOptionPane.showMessageDialog(new JFrame(), "player 1 wins that toss.");
			}
			else {
				comp = false; 
				JOptionPane.showMessageDialog(new JFrame(), "player 2 wins that toss.");
			}
		}
		return comp;
	}
	//Dialog to handle coin face selection
	public int headOrTailDialog() {
		Object[] options = {"Heads","Tails"};
		int coin = JOptionPane.showOptionDialog(new JFrame(),
				"Player 1 Call Heads or Tails  "+ "","A silly Question?",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,options, options[1]);
		return coin;	
	}
	//coinflip logic
	public boolean getHeadOrTail(int coin) {
		boolean choice = true;
		if(coin == 0 || coin == 1) {
				if(coin == 0) choice = true;
				else choice = false;
				return choice;
			}
		else throw new IllegalArgumentException("range not 0 or 1");
	}
	//takes integer values and returns the lowest value
	public int getLowestPlayerWallet (int wallet1, int wallet2) {
		int allInBet = 0;
		if (wallet1 > wallet2) {
			allInBet = wallet2;
		}
		else if (wallet1 < wallet2) {
			allInBet = wallet1;
		}
		else {
			//if both values are the same, just return one of them
			allInBet = wallet1;
		}
		return allInBet;
	}
	
}
