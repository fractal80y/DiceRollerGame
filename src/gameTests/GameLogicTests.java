package gameTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import GameObjects.GameLogic;

class GameLogicTests {

	GameLogic testLogic = new GameLogic();
	
	@Test
	public void testCoinFlip() {
		assertTrue(testLogic.compareInts(20, 10));
		}

	@Test 
	
	public void testCoinFlip2() {
		assertFalse(testLogic.compareInts(10, 20));
	}
	
	
	
	
}
