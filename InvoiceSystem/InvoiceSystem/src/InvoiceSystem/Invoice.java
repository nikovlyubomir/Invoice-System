package InvoiceSystem;

import java.sql.Date;

public class Invoice {

	
	private String date;
	private int invoiceNumber;
	private String adress;
	private double price;
	
	
	public Invoice() {}
	public Invoice(String date, int invoiceNumber, String adress, double price) {
		this.date = date;
		this.invoiceNumber = invoiceNumber;
		this.adress = adress;
		this.price = price;
	}


	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getInvoiceNumber() {
		return invoiceNumber;
	}



	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
}
