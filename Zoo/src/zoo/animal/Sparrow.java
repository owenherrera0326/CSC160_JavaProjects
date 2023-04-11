package zoo.animal;

public class Sparrow extends Bird {

	private final String type = "sparrow";

	public Sparrow() {
		super();
	}

	public <T> Sparrow(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Sparrow(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight, wingspan);
		this.setWingspan(wingspan);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
