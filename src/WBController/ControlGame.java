package WBController;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import WindowBuilder.*;
import WBModel.*;

public class ControlGame {
	private GameModel gMod;
	private GameWindow gWind;
	
	private ActionListener aListen;
	private ItemListener eListen;
	
	public ControlGame (String name1, String name2, int rollNumber, int gameNumber, int wallet){
		gMod = new GameModel( name1,  name2,  rollNumber,  gameNumber,  wallet);
		gWind = new GameWindow(name1,name2,wallet, gameNumber);
		gWind.setRoundCounter(0, gMod.getMaxRounds());
		actionControl();
		itemControl();
	}
	public void itemControl () {
		eListen = new ItemListener () {
			public void itemStateChanged(ItemEvent itemE) {
				if(itemE.getStateChange() == ItemEvent.SELECTED) {
					gMod.checkThatBetIsValid(gWind.getBet());
				}
			}
		};
		gWind.getBetAmt().addItemListener(eListen);
	}
	public void actionControl () {
		aListen = new ActionListener(){
		public void actionPerformed(ActionEvent actionEvent) {
			if (actionEvent.getSource() == gWind.getRoll()) {
				roll();
			}
			else if (actionEvent.getSource() == gWind.getQuit()) {
				System.exit(0);
			}	
        }
		};
		gWind.getRoll().addActionListener(aListen);
		gWind.getQuit().addActionListener(aListen);
		}
	public void roll () {
		//In the case that a valid bet amount is selected, run the roll script
		if (gMod.getValidBool() == true) {
			//roll the dice :) 
			gMod.playerRolls();
		
			//update the game window with the roll results
			gWind.setP1Total(String.valueOf(gMod.getP1Total()));
			gWind.setP2Total(String.valueOf(gMod.getP2Total()));
			gWind.setP1Rolls(gMod.getP1RollString());
			gWind.setP2Rolls(gMod.getP2RollString());
			// checks for who won the round, and carries out bet updating
			gMod.winChecks();
			//updates the UI elements with current values
			gWind.setP1Wallet(gMod.getP1Wallet());
			gWind.setP2Wallet(gMod.getP2Wallet());
			gWind.setRoundCounter(gMod.getCurrentRound(), gMod.getMaxRounds());
			gWind.setP1Count(gMod.getPlayer1GamesWon());
			gWind.setP2Count(gMod.getPlayer2GamesWon());
		}
		else if (gMod.getValidBool()==false) {
			//Bet amount is invalid because a player doesn't have the appropriate amount of funds remaining
			JOptionPane.showMessageDialog(new JFrame(), "Please select a valid betting amount");
		}
	}
}