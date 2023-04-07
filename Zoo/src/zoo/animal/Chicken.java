package zoo.animal;

public class Chicken extends Bird {

	private final String type = "chicken";

	public Chicken() {
		super();
	}

	public <T> Chicken(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Chicken(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
		this.setWingspan(wingspan);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
