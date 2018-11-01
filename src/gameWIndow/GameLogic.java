package gameWIndow;

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
		return compareInts(total1,total2);
		
	}
	public boolean compareInts(int num1,int num2) {
		boolean comp=false;
		if (num1>num2) {
			comp = true;
		}
		else if (num1<num2){
			comp = false;
		}
		return comp;
	}
}
