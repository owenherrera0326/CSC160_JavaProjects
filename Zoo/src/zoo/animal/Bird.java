package zoo.animal;

public class Bird extends Animal {
	
	private final String type = "bird";
	private float wingspan;

	public Bird() {
		super();
		this.wingspan = 0;
	}

	public <T> Bird(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Bird(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.setWingspan(wingspan);
	}

	public float getWingspan() {
		return this.wingspan;
	}

	public void setWingspan(float wingspan) throws Exception {
		if (wingspan > 0)
			this.wingspan = wingspan;
		else
			throw new Exception("Invalid wingspan: " + wingspan);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
}
