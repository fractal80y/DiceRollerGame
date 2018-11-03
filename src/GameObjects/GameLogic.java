package GameObjects;

public class GameLogic {
	
	public GameLogic() {
		
	}
	
	
	//Lambda Block Expression, using Interface to bind function to variable
	interface CoinFlip{
		public boolean flipIt();
	}
	
	//Lambda Coin toss
	CoinFlip toss = () -> {
		byte x;
		 x =(byte) Math.round(Math.random());
		  
		  return  (x == 1) ? true : false;   
	};
	//Coin
	public boolean compareInts(int num1,int num2) {
		boolean comp = false;
		if (num1>num2) {
			comp = true;
		}
		else if (num1<num2){
			comp = false;
		}
		else {
				if(toss.flipIt())  ;
			  
				else  ;
			
		}
		return comp;
	}
	
}
