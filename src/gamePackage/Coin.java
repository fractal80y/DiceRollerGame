package gamePackage;

// Class that you can call a static method to return a true false value.
public class Coin {
	
	private static byte x;
	private static CoinFace state; 
	
//	Roll(){
//	 flipIt();
//	}
	
	public static void setCoinFace(boolean x) {
		
		Coin.state = (x == true) ? CoinFace.HEADS : CoinFace.TAILS;  
	}
	
	public final static void flipIt() {
		  Coin.x =(byte) Math.round(Math.random());
		  Coin.setCoinFace((Coin.x == 1 ? true : false));
		  System.out.println(Coin.getCoinFace());
	}
	
	
	public static CoinFace getCoinFace() {
		return Coin.state;
	}
	
	
	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 5) {
			
			Coin.flipIt();
			System.out.println(Coin.x);
			System.out.println(Coin.getCoinFace()); // check after flip coin that it is correct state.
			x++;
		}
		
		
		
		
		
	}

}
