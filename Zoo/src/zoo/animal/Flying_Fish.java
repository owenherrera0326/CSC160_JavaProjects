package zoo.animal;

public class Flying_Fish extends Fish implements Fly, Swim {

	private final String type = "Flying Fish";

	public Flying_Fish() {
		super();
	}

	public <T> Flying_Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Flying_Fish(T birthdate, float weight, T water) throws Exception {
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
	public void fly() {
		System.out.println("This " + this.type + "is flying...");
		
	}

	@Override
	public void soar() {
		System.out.println("This " + this.type + "is soaring...");
		
	}
	
	@Override
	public void glide() {
		System.out.println("This " + this.type + "is gliding...");
		
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
