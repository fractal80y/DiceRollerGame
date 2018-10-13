package gamePackage;

// Use Face."constant".getValue() and output Array. Of the Enum class.
// Die Face Constants, with associated properties of that Face.

public enum Face {
	
	ONE("You have rolled a 1",(byte)1,"/face1img.png"),
	TWO("You have rolled a 2",(byte)2,"/face2img.png"),
	THREE("You have rolled a 3",(byte)3,"/face3img.png"),
	FOUR("You have rolled a 4",(byte)4,"/face4img.png"),
	FIVE("You have rolled a 5",(byte)5,"/face5img.png"),
	SIX("You have rolled a 6",(byte)6,"/face6img.png");

	// ENUMS constructor are privately called. 
	private Face(final String msg, final byte x, final String y){
		this.msg = msg;
		this.num = x;
		this.locationImg = y;
	}
	
	private final String msg;
	private final byte num;
	private final String locationImg;
	
	public String msg() {return msg;}
	public byte num() {return num;}
	public String img() {return locationImg;}
	
	//Just testing an exception if values are equal. Will need to change this method to semantically represent Exception when scores are tied.
	public boolean isGreater(Face x) throws Exception  {
		if(this.num() > x.num())
		return true;
		else if (this.num()<x.num()) return false;
		else  throw new Exception ("This is a equal roll");
			
		
	}
}
