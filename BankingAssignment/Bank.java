import java.util.ArrayList;
public class Bank {
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private int numberOfCustomers;
	private String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	public void addCustomer(String f, String l) {
		customers.add(new Customer(f,l));
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
		customers.get(customers.size() - 1).setAccount(customer.getAccount());;
	}
	public Customer getCustomers(int index) {
		return customers.get(index);
	}
	
	public void viewCustomerInfo(int index) {
		System.out.println(bankName + " -> Customer : " + customers.get(index).getFirstName() + ", Balance : "
				+ customers.get(index).getAccount().getBalance());
	}
	
	public int getNumberOfCustomers() {
		numberOfCustomers = customers.size();
		return numberOfCustomers;
	}
}
