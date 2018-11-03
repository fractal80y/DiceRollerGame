package GameObjects;

public class GameLogic {
	
	public GameLogic() {
		
	}
	
	public boolean addCompare(int[] roll1,int[] roll2){
		int total1 =0;
		int total2 =0;
		for (int i = 0;i<roll1.length;i++){
			total1 += roll1[i];
			total2 += roll2[i];
			
		}
		System.out.print(""+total1+total2);
		return compareInts(total1,total2);
		
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
	
	public boolean compareInts(int num1,int num2) {
		boolean comp = false;
		if (num1>num2) {
			comp = true;
		}
		else if (num1<num2){
			comp = false;
		}
		else {
				if(toss.flipIt()) System.out.print("HEADS") ;
			  
				else System.out.print("TAILS") ;
			
		}
		return comp;
	}
	
}
