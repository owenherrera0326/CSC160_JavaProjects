package zoo.animal;

public class Flying_Fish extends Fish {

	private final String type = "flying fish";

	public Flying_Fish() {
		super();
	}

	public <T> Flying_Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Flying_Fish(T birthdate, float weight, String water) throws Exception {
		super(birthdate, weight, water);
		this.setWater(water);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
