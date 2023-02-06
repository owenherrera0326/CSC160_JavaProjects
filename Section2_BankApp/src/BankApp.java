
public class BankApp {
	public static void main(String[] args) {
		
		Account myAccount = new Account();
		Account debbieAccount = new Account(1000.10, "Debbie", "Johnson");
		
		System.out.println(myAccount.number);
		System.out.println(debbieAccount.number);
		
		myAccount.balance = 2000.20;
		System.out.println(myAccount.balance);
		System.out.println(debbieAccount.balance);
	}
	
}
