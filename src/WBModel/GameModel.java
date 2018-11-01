package WBModel;
import gameWIndow.*;
import diceGame.*;
public class GameModel {
	private Player p1;
	private Player p2;
	private Game game;
	
	
	public GameModel (String name, String name2, int rolls, int games,int wallet) {
		
		game = new Game(name, name2,rolls,games,wallet);
		
	}
	

}
