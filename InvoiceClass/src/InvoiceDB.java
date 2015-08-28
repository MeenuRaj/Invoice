
public class InvoiceDB 
{
	public static Invoice getInvoice(String code)
	{
		Invoice p = new Invoice();

	
	p.setcode(code);
	if(code.equalsIgnoreCase("bst"))
	{
		p.setdescription("Black shirt");
		p.settaxable(true);
		p.setprice(21.99);
	}
	else if (code.equalsIgnoreCase("sjs"))
	{
		p.setdescription("Skinny Jeans");
		p.settaxable(true);
		p.setprice(35.99);
	}
	else if (code.equalsIgnoreCase("fd"))
	{
		p.setdescription("Groceries");
		p.settaxable(false);
		p.setprice(62.78);
	}
	else
	{
		p.setdescription("Unknown");
	}
	return p;
	}
	

}
