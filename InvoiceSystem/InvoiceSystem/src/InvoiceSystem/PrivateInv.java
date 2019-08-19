package InvoiceSystem;


public class PrivateInv extends Invoice{
	
	private String customerName;
	
	
	public PrivateInv(String date, int invoiceNumber, String adress, double price, String customerName) {
		super(date, invoiceNumber, adress, price);
		this.customerName=customerName;
	}
	public PrivateInv() {}
	
	public void printInvoice() {
		System.out.println("====================================");
		System.out.println("Invoice number " + getInvoiceNumber());
		System.out.println("Date : " + getDate() + " Name: " + this.customerName);
		System.out.println("Customer Adress : " + getAdress());
		System.out.println("Price to pay : " + getPrice() + "dkk");
		System.out.println("====================================");
	}
	

	@Override
	public String toString() {
	    printInvoice();
		return "";

	}
	

	
	

}
