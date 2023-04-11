package zoo.animal;

public class Fish extends Animal {
	
	private final String type = "fish";
	private String water;

	public Fish() {
		super();
		this.water = "unknown";
	}
	
	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Fish(T birthdate, float weight, String water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}

	public String getWater() {
		return this.water;
	}

	public void setWater(String water) throws Exception {
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}