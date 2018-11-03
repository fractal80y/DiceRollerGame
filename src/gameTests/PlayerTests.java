package gameTests;
import GameObjects.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTests {
	Player p = new Player ("Hank",1000);
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
	public void nameSetTest () {
		
	}
	public void walletFallsBelow0CheckerTest () {
		
	}
	public void nameSetOver15CharactersTest () {
		
	}
}
