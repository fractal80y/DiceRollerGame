package guiPack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InitController {
	private ActionListener actionListener;
	private FixedView fV;
	private InitModel iM;
	
	public InitController (InitModel model, FixedView view) {
		this.fV = view;
		this.iM = model;
	}
	
	public void actionControl () {
		actionListener = new ActionListener(){
		public void actionPerformed(ActionEvent actionEvent) {                  
			launch();
        }
		};
		fV.getLaunch().addActionListener(actionListener);
		}
	public void launch () {
		
		
		iM.setP1Name(fV.getP1Name().getText());
		iM.setP2Name(fV.getP2Name().getText());
		iM.setRollNum(Integer.parseInt(fV.getRollAmt().getSelectedItem().toString()));
		iM.setRoundNum(Integer.parseInt(fV.getRoundAmt().getSelectedItem().toString()));
		iM.setWallet(Integer.parseInt(fV.getWalletAmt().getSelectedItem().toString()));
		
		
		
		
	}
}