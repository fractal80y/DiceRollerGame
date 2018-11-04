package gameTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

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
	
	@Test 
	
	public void validRangeCoinInteger(){
		
		assertTrue(testLogic.getHeadOrTail(0));
		
	}
	
	
@Test 
	
	public void validRangeCoinInteger2(){
		
		assertFalse(testLogic.getHeadOrTail(1));
		
	}

@Test
public void itShouldThrowIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class,
            ()->{
            testLogic.getHeadOrTail(4);
            });
	}
}
