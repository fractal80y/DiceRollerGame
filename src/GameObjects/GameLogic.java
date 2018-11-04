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
			//Findt this one
			JOptionPane.showMessageDialog(new JFrame(), "Player 2 Wins.");
			System.exit(0);
		}
			
		else if(player2Wallet <= 0) {
			//Find this one
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
			
			
				if(toss.flipIt() == getHeadOrTail(headOrTailDialog())) { 
					
					comp=true; 
					//find this one
					JOptionPane.showMessageDialog(new JFrame(), "player 1 wins that toss.");
				
				}
		
				else {
					comp = false; 
					//fseesf
					JOptionPane.showMessageDialog(new JFrame(), "player 2 wins that toss.");
				}
		}
		return comp;
	}
	
	public int headOrTailDialog() {
		
		Object[] options = {"Heads","Tails"};
		int coin = JOptionPane.showOptionDialog(new JFrame(),
				"Player 1 Call Heads or Tails  "+ "","A silly Question?",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,options, options[1]);
		
		return coin;
		
	}
	
	public boolean getHeadOrTail(int coin) {
		boolean choice = true;
		
		if(coin == 0 || coin == 1) {
		
				if(coin == 0) choice = true;
				
				else choice = false;
				
				return choice;
			}
		else throw new IllegalArgumentException("range not 0 or 1");
	}
	
}
