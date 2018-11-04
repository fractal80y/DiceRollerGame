package WBController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import WindowBuilder.*;
import WBModel.*;

public class ControlInit {
	private InitWin initWin;
	private WBController.ControlGame gCon;
	private ActionListener aListen;
	
	private GameWindow gWin;
	
	public ControlInit () {
		this.initWin = new InitWin();
		this.actionControl();
		
		
	}
	//Creating new action listener
	public void actionControl () {
		aListen = new ActionListener(){
		public void actionPerformed(ActionEvent actionEvent) {                  
			if (actionEvent.getSource() == initWin.getLaunch()) {
				//on button press, run the launch script
				launch();
			}
        }
		};
		//Adds listener to the launch button in the init window
		initWin.getLaunch().addActionListener(aListen);
		}
	public void launch () {
		//checking for appropriately named players
		if (initWin.getN1().length()<=15&&initWin.getN2().length()<=15) {
			gCon = new WBController.ControlGame(initWin.getN1(),initWin.getN2(),initWin.getRolls(),initWin.getRounds(),initWin.getWallet());
			//Build Game window and dispose this one
			initWin.getJF().dispose();
		}
		else if (initWin.getN1().length()>15||initWin.getN2().length()>15) {
			//Shows dialog feedback of user input, also prevents the launch script from running
			JOptionPane.showMessageDialog(new JFrame(), "Player names can only be max 15 characters");
		}
	}
}
