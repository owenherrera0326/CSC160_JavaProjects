import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Animal {
	
	private static int counter = 0;
	
	private int id;
	private final String type;
	private float weight;
	
	SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH);
	
	/**
	 * https://www.baeldung.com/java-string-to-date
	 * SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH);
	 * String dateInString = "7-Jun-2013";
	 * Date date = formatter.parse(dateInString);
	 */
	private Date birthdate;
		
	public Animal() {
	
		this.id = ++Animal.counter;
		this.type = "Animal";
		this.weight = 0;
		this.birthdate = null;
	}
	
	public Animal(float weight, String birthdate) throws Exception {
		this();
		this.setWeight(weight);
		this.setBirthdate(birthdate);
		
	}
	
	public Animal(float weight, Date birthdate) throws Exception {
		this();
		this.setWeight(weight);
		this.setBirthdate(birthdate);
		
	}
	
	public void setBirthdate(String birthdate) throws ParseException {
		this.birthdate = formatter.parse(birthdate);
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void setWeight(float weight) throws Exception {
		if (weight <= 0) {
			throw new Exception("Invalid weight: " + weight);
		} else {
			this.weight = weight;
		}
	}
}
