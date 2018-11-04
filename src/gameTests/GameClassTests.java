package gameTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import GameObjects.Game;
class GameClassTests {
	Game g = new Game ("Matt","Hank",3,3,1000);
	@Test
	public void testRoundTotal() {
		g.incRoundTotal();
		assertEquals(1,g.getCurrentRounds());
	}
	
	
}
