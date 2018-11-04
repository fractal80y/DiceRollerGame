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
	public void actionControl () {
		aListen = new ActionListener(){
		public void actionPerformed(ActionEvent actionEvent) {                  
			if (actionEvent.getSource() == initWin.getLaunch()) {
				launch();
			}
        }
		};
		initWin.getLaunch().addActionListener(aListen);
		}
	public void launch () {
		if (initWin.getN1().length()<=15&&initWin.getN2().length()<=15) {
			gCon = new WBController.ControlGame(initWin.getN1(),initWin.getN2(),initWin.getRolls(),initWin.getRounds(),initWin.getWallet());
			initWin.getJF().dispose();
		}
		else if (initWin.getN1().length()>15||initWin.getN2().length()>15) {
			// Number 3, not fixed method something like invalidnamedialog
			JOptionPane.showMessageDialog(new JFrame(), "Player names can only be max 15 characters");
		}
	}
}
