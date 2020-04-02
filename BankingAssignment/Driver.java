
public class Driver {
	public static void main(String args[]) {
		Bank BCA = new Bank("Bank BCA");
		Account firstAccount = new Account(50000);
		Account secondAccount = new Account(200000);

		Customer firstCust = new Customer("John","Doe");
		Customer secondCust = new Customer("Mary","Sue");
		secondCust.setAccount(secondAccount);
		
		BCA.addCustomer(firstCust.getFirstName(), firstCust.getLastName());
		BCA.addCustomer(secondCust);
		
		BCA.getCustomers(0).setAccount(firstAccount);
		BCA.getCustomers(0).getAccount().withdraw(40000);
		BCA.viewCustomerInfo(0);
		BCA.viewCustomerInfo(1);
	}
}
