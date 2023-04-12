package zoo.animal;

public class Flying_Fish extends Fish implements Fly {

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
	public void flying() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soaring() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
