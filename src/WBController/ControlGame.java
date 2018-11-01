package WBController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import WindowBuilder.*;
import WBModel.*;

public class ControlGame {
	private GameModel gMod;
	private GameWindow gWind;
	public ControlGame (String name, String name2, int rolls, int games,int wallet){
		gMod = new GameModel(name,name2,rolls,games,wallet);
		gWind = new GameWindow();
		
	}

}
