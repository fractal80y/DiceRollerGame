package WBController;
import gameWindow.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import WindowBuilder.*;
import WBModel.*;

public class ControlGame {
	private GameModel gMod;
	private GameWindow gWind;
	private ActionListener aListen;
	public ControlGame (String name1, String name2, int rollNumber, int gameNumber, int wallet){
		gMod = new GameModel( name1,  name2,  rollNumber,  gameNumber,  wallet);
		gWind = new GameWindow(name1,name2,wallet, gameNumber);
		actionControl();
		
	}
	public void actionControl () {
		aListen = new ActionListener(){
		public void actionPerformed(ActionEvent actionEvent) {
			 
			
			if (actionEvent.getSource() == gWind.getRoll()) {
				
				roll();
				updateGui();
				
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
		gMod.playerRolls(gWind.getBet());
		
	}
	public void updateGui () {
		gWind.setP1Wallet(gMod.getP1Wallet());
		gWind.setP2Wallet(gMod.getP2Wallet());
		gWind.setRoundCounter(gMod.getCurrentRound(), gMod.getMaxRounds());
	}

}
