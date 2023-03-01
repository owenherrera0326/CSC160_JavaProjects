public class Intersection {
	private Street street1;
	private Street street2;
	
	public Intersection() {
		this.street1 = new Street();
		this.street2 = new Street();
	}

	public Intersection(String name1, String name2) {
		this();
		this.street1.setName(name1);
		this.street2.setName(name2);
	}
	
}
