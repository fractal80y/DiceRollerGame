package guiPack;

public class GUIMain {
	public static void main (String[] args) {
		
		InitController c = new InitController(new InitModel(), new FixedView());
		c.actionControl();
		
		
		
		
	}

}
