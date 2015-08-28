

public class Invoice 
{
	private String item;
	private String code;
	private String description;
	private double price; 
	private int quantity;
	private double tax;
	private boolean taxable;
	
	
	public Invoice()
	{
		item = "";
		code = "";
		description = "";
		price = 0;
		quantity = 0;
		tax = 0;
		taxable = true;
	}
	
	public void setitem(String item)
	{
		this.item = item;
	}
	public String getitem()
	{
		return item;
	}
	
	public void setcode(String code)
	{
		this.code = code;
	}
	public String getcode()
	{
		return code;
	}
	
	
	public void setdescription(String description)
	{
		this.description = description;
	}
	public String getdescription()
	{
		return description;
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}
	public double getprice()
	{
		
		return price;
	}
	
	public void setquantity(int quantity)
	{
		this.quantity = quantity;
	}
	public double getquantity()
	{
		return quantity;
	}
	
	public void settax(double tax)
	{
		this.tax = tax;
	}
	public double gettax()
	{
		return tax;
	}
	
	public void settaxable(boolean taxable)
	{
		this.taxable = taxable;
	}
	public boolean gettaxable()
	{
		return taxable;
	}

	
	

		
	}


