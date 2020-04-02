
public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Amount exceeded balance");
			return false;
		}
		else {
			this.balance -= amount;
			return true;
		}
	}
}
