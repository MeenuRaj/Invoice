
// this is the main program
import java.util.Scanner;
import java.text.NumberFormat;


public class LineItemApp 
{

	public static void main(String[] args) 
	{
		double total = 0;
		double tax = 0;
		
		double subtax = 0;
		double untax = 0;
		System.out.println("Welome to the Line Item Display");
		System.out.println();
		
		//display one of more products
		Validator valid = new Validator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to enter an item?(y/n) ");
		String choice = scan.next();
		
		while (choice.equalsIgnoreCase("y"))
			{
			System.out.println("Enter item code: ");
			String code = scan.next();
			scan.nextLine();
			
			System.out.println("Enter quantity ");
			int quantity = scan.nextInt();
			scan.nextLine();
			if (valid.isValid(quantity))  //this section validates the quantity
			{
				System.out.println("invalid quantity");
				System.out.println("Enter quantity ");
				quantity = scan.nextInt();
				scan.nextLine();
			}
			Invoice invoice = InvoiceDB.getInvoice(code);
			if (invoice.gettaxable())
			{
				subtax += ((invoice.getprice())*quantity);
				tax += (invoice.getprice())*(0.08*quantity);
				
			}
			else
			{
				untax += (invoice.getprice()*quantity);
			}
			
		
			//display output
			//System.out.println();
			//System.out.println("Selected Product");
			//System.out.println("Description: " +invoice.getdescription());
			//System.out.println("Price: $" +invoice.getprice());
			//System.out.println();
			
			total = subtax+tax+untax;
			
			
			
				System.out.print("Continue? (y/n): ");
				choice = scan.nextLine();
				System.out.println();
				
			}

		
	
		//formats the prices to $ format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String subtaxD = currency.format(subtax);
		String taxD = currency.format(tax);
		String untaxD = currency.format(untax);
		String totalD = currency.format(total);
		
		System.out.println("Taxable subtotal is " +subtaxD);
		System.out.println("Untaxable subtotal is " +untaxD);
		System.out.println("Taxable tax " +taxD);
		System.out.println("Total payable is  " +totalD);
		

	}

}






