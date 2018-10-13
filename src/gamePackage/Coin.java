package gamePackage;

// Class that you can call a static method to return a true false value.
public class Coin {
	
	private static byte x;
	private static CoinFace state; 
	
//	Roll(){
//	 flipIt();
//	}
	
	
	
	public final static CoinFace flipIt() {
		  x =(byte) Math.round(Math.random());
		  
		  return  (x == 1) ? CoinFace.HEADS : CoinFace.TAILS;   
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 5) {
			
			System.out.println(Coin.flipIt());
			System.out.println(Coin.x);
			x++;
		}
		
		
		
		
		
	}

}
