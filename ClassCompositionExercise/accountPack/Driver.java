package accountPack;

public class Driver {
	public static void main(String args[]) {
		Customer cust = new Customer(3,"John Doe", 'm');
		Account bankAcc = new Account(1301,cust,50000);
		bankAcc.deposit(10000);
		bankAcc.withdraw(80000);
	}
}
