import java.util.*;


public class Client {    
	
	private int no_of_tables;
	private String table_style;
	
	public static void main(String[] args) {
			
		
		System.out.println("No. of Tables");         //client input for no of tables
	    Scanner scanner = new Scanner(System.in);
	    int no_of_tables = scanner.nextInt();
	    
	    if(no_of_tables>0)
	    {
	    System.out.println("Valid figure");
	    System.out.println("Enter the type of table setting you want to place an order, Options - Vintage/Modern/Contemporary ");   //type of table setting
	    Scanner scanner2 = new Scanner(System.in);
	    String table_style = scanner2.nextLine();
	    System.out.println(table_style);		//input and printing the statement
	    // loop for multiple attempts of correct input of Vintage/Modern/Contemporary
	    scanner.close();
	    scanner2.close();
	    
	    //public void set_no_of_tables(int tables)
	    //{
	    	//this.no_of_tables = tables;
	    //}
//	    public int get_no_of_tables()
//	    {
//	    	return no_of_tables;
//	    }
//	    public void set_table_style(String style_of_table)
//	    {
//	    	table_style = style_of_table;
//	    }
//	    public int get_table_style()
//	    {
//	    	return table_style;
//	    }
	    
	    Party_setting ps = new Party_setting(no_of_tables, table_style);
	    if ("Vintage".equals(table_style) || "vintage".equals(table_style))
	    {	
	    	System.out.println(table_style);
	    	ps.calculate_cost_vintage(no_of_tables);
	    }
	   else if ("Modern".equals(table_style) || "modern".equals(table_style))
	    {
	    	System.out.println(table_style);
	    	ps.calculate_cost_modern(no_of_tables);
	    }
	   else if ("Contemporary".equals(table_style) || "contemporary".equals(table_style)) 
	    {
	    	System.out.println(table_style);
	    	ps.calculate_cost_contemporary(no_of_tables);
	    }
 //calling the method by creating object of another class Party_order
	    ps.display_party_setting(table_style);
	    }
	    else{
	    System.out.println("Order to be entered should be greater than atleast 1 or 1");
	    }
	}}
