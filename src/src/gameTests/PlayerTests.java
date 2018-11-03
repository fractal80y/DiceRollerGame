package gameTests;
import GameObjects.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTests {
	Player p = new Player ("Hank",1000);
	
	//Wallet Unit Tests
	@Test
	public void walletSetTest() {
		p.setWallet(1000);
		assertEquals(1000,p.getWallet());
	}
	@Test
	public void updateWalletLosingMoneyTest () {
		p.updateWallet(-100);
		assertEquals(900,p.getWallet());
	}
	@Test
	public void walletFallsBelow0CheckerTest () {
		// TDD this methods
		fail();
	}
	//Name set tests
	@Test
	public void nameSetTest () {
		p.setName("Marth");
		assertEquals("Marth",p.getName());
	}
	
	@Test
	public void nameSetOver15CharactersTest () {
		//TDD this method
		fail();
	}
	//Games won testing
	@Test
	public void updateGamesWonTest () {
		p.updateGamesWon();
		assertEquals(1,p.getGamesWon());
	}
	@Test
	public void resetGamesWonTest () {
		p.resetGamesWon();
		assertEquals(0,p.getGamesWon());
	}
	
	//Roll list testing
	@Test
	public void addRollListTest () {
		int[] testList = new int[]{1,2,3};
		p.addRollList(testList);
		assertEquals(1,p.getRollsList().size());
	}
	@Test
	public void getRollListIndexTest () {
		int[] testList = new int[]{1,2,3};
		p.addRollList(testList);
		assertEquals(testList,p.getRollsListIndex(0));
	}
	@Test
	public void clearRollListTest () {
		p.clearRollList();
		assertEquals(0,p.getRollsList().size());
	}
}
