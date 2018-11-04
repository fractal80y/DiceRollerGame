package GameObjects;

import javax.swing.*;
import javax.swing.JOptionPane;

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
	//Coin
	public boolean compareInts(int num1,int num2) {
		boolean comp = false;
		if (num1>num2) {
			comp = true;
		}
		else if (num1<num2){
			comp = false;
		}
		else { 
			
			
				if(toss.flipIt() == getHeadOrTail()) { 
					comp=true; JOptionPane.showMessageDialog(new JFrame(), "player 1 wins that toss.");
				
				}
		
				else {
					comp = false; JOptionPane.showMessageDialog(new JFrame(), "player 2 wins that toss.");
				}
		}
		return comp;
	}
	
	public boolean getHeadOrTail() {
		boolean choice = true;
		Object[] options = {"Heads",
        "Tails"};
		int coin = JOptionPane.showOptionDialog(new JFrame(),
					"Player 1 Call Heads or Tails  "+ "","A silly Question?",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,options, options[1]);
		
		if(coin == 0) choice = true;
		else choice = false;

return choice;
	}	
}
