package invoicePack;

public class Driver {
	public static void main(String args[]) {
		Customer cust = new Customer(3,"John Doe", 50);
		Invoice paper = new Invoice(5,cust,50000);
		System.out.println(paper.getAmountAfterDiscount());
	}
}
