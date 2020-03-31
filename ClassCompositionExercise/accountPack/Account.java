package accountPack;

public class Account {
	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String getCustomerName() {
		return this.customer.getName();
	}
	@Override
	public String toString() {
		return customer + "balance = $" + Math.round(balance * 100) / 100;
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		return this;
	}
	public Account withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			return this;
		}
		else {
			System.out.println("Amount withdrawn exceeds balance!");
			return this;
		}
	}
	
	
}
