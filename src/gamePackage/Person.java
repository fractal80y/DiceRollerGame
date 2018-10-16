package gamePackage;

public class Person {
	private String name;
	private int wallet;
	
	
	public Person () {
		
	}
	public Person (String name, int walletCash) {
		this.setName(name);
		this.setWallet(walletCash);
	}
	public void updateWallet (int cash) {
		if (this.getWallet()-cash >=0) {
			this.setWallet(this.getWallet()+cash);
		}
		else {
			throw new Error ("rart");
		}
	}
	
	
	
	
	
	public void setName (String name) {
		this.name = name;
	}
	public void setWallet (int cash) {
		this.wallet = cash;
	}
	public String getName() {
		return this.name;
	}
	public int getWallet () {
		return this.wallet;
	}
}
