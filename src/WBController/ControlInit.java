package WBController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
			launch();
        }
		};
		initWin.getLaunch().addActionListener(aListen);
		}
	public void launch () {
		
		
		
		
		
		//initWin.getJF().dispose();
		System.out.print(initWin.getRolls());
		System.out.print(initWin.getRounds());
		System.out.print(initWin.getWallet());
		
		
		gCon = new WBController.ControlGame(initWin.getN1(),initWin.getN2(),initWin.getRolls(),initWin.getRounds(),initWin.getWallet());
		initWin.getJF().dispose();
	}
}
