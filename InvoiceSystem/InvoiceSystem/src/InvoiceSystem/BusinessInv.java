package InvoiceSystem;

public class BusinessInv extends Invoice{

	private String companyName;
	
	
	public BusinessInv(String date, int invoiceNumber, String adress, double price, String companyName) {
		super(date, invoiceNumber, adress, price);	
		this.companyName = companyName;
	}
	
	public void printInvoice() {
		System.out.println("====================================");
		System.out.println("Invoice number " + getInvoiceNumber());
		System.out.println("Date : " + getDate() + " Name: " + this.companyName);
		System.out.println("Company Adress : " + getAdress());
		System.out.println("Price without VAT : " + getPrice() + "dkk");
		System.out.println("Price with VAT : " + getPrice()*1.25 + "dkk");
		System.out.println("====================================");
	}
	

	@Override
	public String toString() {
	    printInvoice();
		return "";

	}

}
