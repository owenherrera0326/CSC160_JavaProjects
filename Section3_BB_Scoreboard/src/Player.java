
public class Player {

	private String name;
	private int jersey;
	private int fouls;
	private int fieldGoals_1pt;
	private int fieldGoals_2pt;
	private int fieldGoals_3pt;
	
	public Player() {
		this.name   = "unknown";
		this.jersey = 0;
		this.fouls  = 0;
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;
	}
	
	public Player(String name, int jersey) throws Exception {
		this();
		this.name = name;
		this.setName(name);
		this.setJersey(jersey);
	}
	
	public Player(int jersey) throws Exception {
		this();
		this.setJersey(jersey);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getJersey() {
		return this.jersey;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJersey(int jersey) throws Exception {
		if (jersey >= 0 && jersey <= 99)
			this.jersey = jersey;
		else
			throw new Exception("Invalid jersey number. Must be between 0-99");
	}
	
	// equals
	// return this.fg_pt1 + (this.fg_pt2) + (this.fg_pt3);
	
	/*
	switch(shotType)
		case1: this.fg_pt1++
		break;
	default:
	throw new Exception Invalid Shot Type
	*/
}
