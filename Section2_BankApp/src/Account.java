/**
 * Class used to create Account objects
 * @author owher
 */
public class Account {
	
	// this is a class level field - share across all accounts
	/**
	 * The last account number used for all accounts in my bank
	 * Class level field shared across all account
	 */
	private static int lastNumber = 0;
	
	// instance level fields - unique per account
	// a field can also be called attribute or property
	
	/**
	 * The unique account number for my bank
	 */
	private int number;
	private String firstName;
	private String lastName;
	private double balance;
	
	/**
	 * The default constructor automatically assign
	 * the next account number
	 * and sets default field values
	 * returns unique account object 
	 */
	public Account() {
		System.out.println("Default constructor");
		
		this.number 	= ++Account.lastNumber;
		this.balance 	= 0;
		this.firstName 	= "Unknown";
		this.lastName	= "Unknown";
	} // end of default

	// overload constructor that allows setting the object's fields
	
	/**
	 * The overload constructor calls the default constructor
	 * and then allows overriding the default values
	 * returns unique account object
	 * @param firstName the account owner's first name
	 * @param lastName the account owner's last name
	 * @param balance the account owner's balance
	 */
	public Account(String firstName, String lastName, double balance) {
		this(); // call the default constructor
		
		// can not run this before calling default constructor
		System.out.println("Overload constructor");
		
		this.firstName 	= firstName;
		this.lastName 	= lastName;
		this.balance 	= balance;
	} // end of overload constructor

	/**
	 * Allows getting the account number
	 * @return the account number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Allows getting the account owners name
	 * @return the account owners name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Allows changing the account owner's first name
	 * only if the first name isn't blank
	 * @param firstName The account owners first name.
	 */
	public void setFirstName(String firstName) {
		if (firstName == "")
			System.out.println("Invalid first name. Name can not be empty");
		else
		this.firstName = firstName;
	}

	/**
	 * Allows getting the account owner's last name
	 * @return the account owner's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Allows changing the owner's last name
	 * only if the last name isn't blank
	 * @param lastName The account owner's last name
	 */
	public void setLastName(String lastName) {
		if (lastName == "")
			System.out.println("Invalid last name. Name can not be empty");
		this.lastName = lastName;
	}

	/**
	 * Allows getting the account balance
	 * @return the account balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Allows depositing money into the account but only if it's greater than 0
	 * 
	 * @param amount The amount to deposit
	 */
	public void deposit(double amount) {
		if (amount <= 0)
			System.out.println("Invalid deposit [" + amount + "] Can not be less or equal to 0");
		else
			this.balance = balance;
	}

		/**
	 * Allows withdrawing money from the account but only if it's greater than 0
	 * 
	 * @param amount The amount to deposit
	 */
	public void withdrawal(double amount) {
		if (amount <= 0)
			System.out.println("Invalid withdrawal [" + amount + "] Can not be less or equal to 0");
		else if (amount > this.balance)
			System.out.println("Invalid withdrawal [" + amount + "]) Can not be more than account balance");
		else
			this.balance = balance;
	}
	
	/**
	 * Allows getting the last account number used
	 * @return the last account number used
	 */
	public static int getLastNumber() {
		return lastNumber;
	}
	
} // end of Account class
