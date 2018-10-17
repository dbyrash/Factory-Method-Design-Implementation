

public class Party_setting{
	
	public int total_vintage_cost = 0;
	public int total_modern_cost = 0;
	public int total_contemporary_cost=0;
		
	int no_of_tables=0;
	String table_style;
	//ArrayList<table_setting> tables = new ArrayList<table_settings>();

	public Party_setting(int no_of_tables, String table_style){
		// given n and type calculate a method which decides the object to be use between Vintage/Modern/Contemporary
	//	method();
			this.no_of_tables = no_of_tables;    //using constructor to call the tables & type	
			this.table_style = table_style;
	}
			
	public void calculate_cost_vintage(int no_of_tables) //calculate_cost calculates cost of total Tables ordered.
		{
			Table table_setting = new Table();
			total_vintage_cost = table_setting.get_Vintage_cost()*no_of_tables;
			//return total_vintage_cost;
			System.out.println("Total cost of Vintage Party Setting " + total_vintage_cost);
		}
			
		public void calculate_cost_modern(int no_of_tables)
			{
			Table table_setting = new Table();  //object created for Table class is table_setting
			total_modern_cost = table_setting.get_Modern_cost()*no_of_tables;
			//return total_modern_cost;
			System.out.println("Total cost of Modern Party Setting " + total_modern_cost);
			}
	
		public void calculate_cost_contemporary(int no_of_tables)
			{
			Table table_setting = new Table();
			total_contemporary_cost = table_setting.get_Contemporary_cost()*no_of_tables;
			//return total_contemporary_cost;
			System.out.println("Total cost of Contemporary Party Setting " + total_contemporary_cost);
			}
		
	public void display_party_setting(String table_style){ //displays the party setting type.
		System.out.println("Table type you chose: "+ this.table_style + " and no of Tables " + this.no_of_tables);
		System.out.println("Per table coontains 1 center_piece, 4 Chair and 4 Place Setting");
	}
}