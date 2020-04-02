
public class Customer {
	private String firstName;
	private String lastName;
	private Account account = null;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		if(account != null) 
			return account;
		else {
			System.out.println("No account founded");
			return null;
		}
			
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
