package WBController;
import gameWIndow.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import WindowBuilder.*;
import WBModel.*;

public class ControlGame {
	private GameModel gMod;
	private GameWindow gWind;
	public ControlGame (Game game){
		gMod = new GameModel(game);
		gWind = new GameWindow();
		
	}

}
