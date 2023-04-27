package zoo.animal;

public class Guppy extends Fish implements Swim {

	private final String type = "Guppy";

	public Guppy() {
		super();
	}

	public <T> Guppy(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Guppy(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight, water);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}

	@Override
	public void eat() {
		System.out.println("This " + this.type + "is eating...");
		
	}

	@Override
	public void swim() {
		System.out.println("This " + this.type + "is swimming...");
		
	}

	@Override
	public void dive() {
		System.out.println("This " + this.type + "is diving...");
		
	}
	
}
