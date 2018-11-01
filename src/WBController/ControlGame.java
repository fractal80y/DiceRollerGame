package WBController;
import gameWIndow.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import WindowBuilder.*;
import WBModel.*;

public class ControlGame {
	private GameModel gMod;
	private GameWindow gWind;
<<<<<<< HEAD
	public ControlGame (String name, String name2, int rolls, int games,int wallet){
		gMod = new GameModel(name,name2,rolls,games,wallet);
=======
	public ControlGame (Game game){
		gMod = new GameModel(game);
		gWind = new GameWindow();
>>>>>>> branch 'Doije-patch-1' of https://github.com/fractal80y/DiceRollerGame.git
		
	}

}
