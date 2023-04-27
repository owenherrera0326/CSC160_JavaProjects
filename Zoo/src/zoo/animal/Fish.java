package zoo.animal;

public class Fish extends Animal implements Swim  {
	
	protected final String type = "Fish";
	protected Water water;
	
	public Fish() {
		super();
		this.water = Water.UNKNOWN;
	}
	
	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	public <T> Fish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}

	public Water getWater() {
		return this.water;
	}

	public <T>void setWater(T water) throws Exception {
		if(water instanceof String) {
			String s = (String) water;
			
			s = s.toLowerCase();
			
			switch(s) {
			case "f":
			case "fresh":
			case "fresh water":
			case "freshwater":
				this.water = Water.FRESH_WATER;
				break;
			case "s":
			case "salt":
			case "salt water":
			case "saltwater":
				this.water = Water.SALT_WATER;
				break;
			default:
				throw new Exception("Invalid water type: " + s);
			}
		} else if (water instanceof Water) {
			this.water = (Water) water;
		} else {
			throw new Exception("Invalid water type: " + water);
		}
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