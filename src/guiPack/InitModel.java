package guiPack;

public class InitModel {
	private String p1Name;
	private String p2Name;
	private int wallet;
	private int rollNum;
	private int roundNum;
	
	public InitModel () {
		this.p1Name = "none";
		this.p2Name = "none";
		this.wallet = 500;
		this.rollNum = 1;
		this.roundNum = 1;
		
	}

	public String getP1Name() {
		return p1Name;
	}

	public void setP1Name(String p1Name) {
		this.p1Name = p1Name;
	}

	public String getP2Name() {
		return p2Name;
	}

	public void setP2Name(String p2Name) {
		this.p2Name = p2Name;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getRoundNum() {
		return roundNum;
	}

	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	

}
