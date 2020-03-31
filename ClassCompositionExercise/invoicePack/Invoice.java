package invoicePack;

public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice(int iD, Customer customer, double amount) {
		ID = iD;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getID() {
		return ID;
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	public double getAmountAfterDiscount() {
		double result = amount - (amount * (double)customer.getDiscount() / 100);
		return result;
	}
}
