public class Account {
	
	// class field shared across all classes
	private static int incomingAccount = 0;
	
	// every object will have it's own values
	public int    number;
	public double balance;
	public String firstName;
	public String lastName;
	
	// defaultconstructor
	public Account () {
		this.number    = ++Account.incomingAccount;
		this.balance   = 0.0;
		this.firstName = "Unknown";
		this.lastName  = "Unknown";
	}
	
	// overload constructor
	public Account (double balance, String firstName, String lastName) {
		this(); // call the default constructor
		this.balance   = balance;
		this.firstName = firstName;
		this.lastName  = lastName;
	}
}
