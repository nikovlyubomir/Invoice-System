package InvoiceSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	
	Scanner sc = new Scanner(System.in);
	private PrivateInv privInv;
	private BusinessInv busInv;
	
	ArrayList<PrivateInv> priIn=new ArrayList();
	ArrayList<BusinessInv> busIn=new ArrayList();
	
	
	
	public void printMenu() {
		System.out.println("Invoice Application");
		System.out.println("------------------------");
		System.out.println("Please choose: \n1 - Add private invoice \n2 - Add business invoice \n3 - Check bussines invoices\n4 - Check private invoices");
		System.out.println("------------------------");
		int i = sc.nextInt();
		switch(i) {
		case 1:  addPrivateInv(); 
		         printMenu();
		         break;
		         
        case 2: addBussinesInv();
		        printMenu();  
                break;
                
		case 4: showPrivateInv();
		        printMenu();
                break;
		case 3:
			    showBusinessInv();
			    printMenu();
                break;
                
        default:
			   System.out.println();
		}
	}
	
	public void addPrivateInv() {
		String date;
		int invNumber;
		String adress;
		double price;
		String customerName;
		System.out.println("Please write the date");
		date = sc.nextLine();	
		date = sc.nextLine();
		System.out.println("Please write the invoice number");
		invNumber = sc.nextInt();
		System.out.println("Please write the price");
		price = sc.nextInt();
		if(price <= 0) {
			System.out.println("Please add positive amount of price!");
			price = sc.nextInt();
		}
		System.out.println("Please write the full name of the customer");
		customerName = sc.nextLine();
		customerName = sc.nextLine();
		System.out.println("Please write the adress");
		adress = sc.nextLine();
		if(adress==null) {
			System.out.println("Please add adress corectly!");
			adress = sc.nextLine();
		}
		
		
		PrivateInv inv = new PrivateInv(date, invNumber, adress, price, customerName);
		System.out.println("------------------------");
		System.out.println("Succesfully created invoice");	
		System.out.println("------------------------");
		priIn.add(inv);
		
		
	}
	
	public void addBussinesInv() {
		String date;
		int invNumber;
		String adress;
		double price;
		String customerName;
		System.out.println("Please write the date");
		date = sc.nextLine();	
		date = sc.nextLine();
		System.out.println("Please write the invoice number");
		invNumber = sc.nextInt();
		System.out.println("Please write the price");
		price = sc.nextInt();
		if(price <= 0) {
			System.out.println("Please add positive amount of price!");
			price = sc.nextInt();
		}
		System.out.println("Please write the name of the company");
		customerName = sc.nextLine();
		customerName = sc.nextLine();
		System.out.println("Please write the adress");
		adress = sc.nextLine();
		if(adress==null) {
			System.out.println("Please add adress corectly!");
			adress = sc.nextLine();
		}
		
		
		BusinessInv inv = new BusinessInv(date, invNumber, adress, price, customerName);
		busIn.add(inv);
		System.out.println("------------------------");
		System.out.println("Succesfully created invoice");	
		System.out.println("------------------------");
	}
	
	public void showPrivateInv() {
		System.out.println("------------------------");
		System.out.println("These are all private invoices we have in our system");
		for(PrivateInv i:priIn) {
			System.out.println(i);
		}
		System.out.println("------------------------");
	}
	
	public void showBusinessInv() {
		System.out.println("------------------------");
		System.out.println("These are all business invoices we have in our system");
		for(BusinessInv i:busIn) {
			System.out.println(i);
		}
		System.out.println("------------------------");
	}
	
	
	
}
