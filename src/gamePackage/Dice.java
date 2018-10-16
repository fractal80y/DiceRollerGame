package gamePackage;
import java.util.Random;

public class Dice {
	Random r;
	Face[] num = Face.values();
	public Dice () {
		r = new Random();
	}
	public static int roll() {
		 double i =  Math.random() * 6 + 1 ;
		 return (int)(i);
	}
	public Face rollGui() {
		Face faceValue = num[this.rollCommandLine()];
		return faceValue;
	}
	public Face returnFace(int x) {
		
		Face faceValue = num[x];
		
		
		
		return faceValue;
	}
	
	public int rollCommandLine () {
		int dice = r.nextInt(6);
		return dice+1;
	}
	
	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println(d.rollGui());
		int[] hank;
		hank += 5;
		System.out.print(hank);
	}
}
