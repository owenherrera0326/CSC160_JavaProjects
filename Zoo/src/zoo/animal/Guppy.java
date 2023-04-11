package zoo.animal;

public class Guppy extends Fish {

	private final String type = "guppy";

	public Guppy() {
		super();
	}

	public <T> Guppy(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Guppy(T birthdate, float weight, String water) throws Exception {
		super(birthdate, weight, water);
		this.setWater(water);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
