package gameTests;
import GameObjects.*;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DiceTests {
	private Dice d = new Dice () ;
	
	//Testing the roll number generator
	@Test
	public void diceNumTest () {
		assertTrue(1 <= d.rollCommandLine() && d.rollCommandLine() <= 6);
	}
	//Testing the generated roll list
	@Test
	public void diceListTest () {
		assertEquals(3,d.generateRolls(3).length);
	}

}
