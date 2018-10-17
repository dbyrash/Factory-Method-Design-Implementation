
public class Table {
	
	Chair_factory[] chair_arr;		//uses complex objects, an array of chairs as an object is stored.
	Center_piece_factory[] center_piece_arr; // an array of center_piece as an object is stored 
	Place_Setting_factory[] place_setting_arr; // an array of Place_Setting is stored as an object.
	
	public Table(){
		chair_arr = new Chair_factory[4];
		for (int i=0; i<4; i++)  // creates 4 objects of chairs in a single Table
		{
			Chair_factory c = new Chair_factory();
			chair_arr[i] = c;
		}
		center_piece_arr = new Center_piece_factory[1];	
		for(int i=0; i<1; i++)   // creates one object of center_piece  in a single Table
		{
			Center_piece_factory cp = new Center_piece_factory();
			center_piece_arr[i] = cp;
		}
		place_setting_arr = new Place_Setting_factory[4];
		for(int i=0; i<4; i++)  //creates 4 object of place_settings  in a single Table
		{
			Place_Setting_factory ps = new Place_Setting_factory();
			place_setting_arr[i] = ps;
		}		
	}

	public int get_Vintage_cost(){  // method that calculates the cost of each Table of style Vintage
		int cost_chair = 0;
		int cost_center_piece = 0;
		int cost_place_setting = 0;
		
		for (int i=0; i<4;i++)
		{
			cost_chair = cost_chair + chair_arr[i].cost_of_vintage_chair();
			
		}
		for (int i=0; i<1;i++)
		{
			cost_center_piece = cost_center_piece + center_piece_arr[i].cost_of_vintage_center_piece();
			
		}
		for (int i=0; i<4;i++)
		{
			cost_place_setting = cost_place_setting + place_setting_arr[i].cost_of_vintage_place_setting();
			
		}
		int cost_of_each_table_setting = 0;
		cost_of_each_table_setting = cost_chair + cost_center_piece + cost_place_setting;
		System.out.println("Cost of Vintage Chairs in Each Table " +cost_chair);
		System.out.println("Cost of Vintage Center_Piece in Each Table " +cost_center_piece);
		System.out.println("Cost of Vintage Place Setting in Each Table " + cost_place_setting);
		return cost_of_each_table_setting;
		
	}
	public int get_Modern_cost(){  //method that calculates the cost of each Table of style Modern
		int cost_chair = 0;
		int cost_center_piece = 0;
		int cost_place_setting = 0;
		
		for (int i=0; i<4;i++)
		{
			cost_chair = cost_chair + chair_arr[i].cost_of_modern_chair();
			
		}
		for (int i=0; i<1;i++)
		{
			cost_center_piece = cost_center_piece + center_piece_arr[i].cost_of_modern_center_piece();
			
		}
		for (int i=0; i<4;i++)
		{
			cost_place_setting = cost_place_setting + place_setting_arr[i].cost_of_modern_place_setting();
			
		}
		int cost_of_each_table_setting = 0;
		cost_of_each_table_setting = cost_chair + cost_center_piece + cost_place_setting;
		System.out.println("Cost of Modern Chairs in Each Table " +cost_chair);
		System.out.println("Cost of Modern Center_Piece in Each Table " +cost_center_piece);
		System.out.println("Cost of Modern Place Setting in Each Table " + cost_place_setting);
		return cost_of_each_table_setting;
	}
	
	public int get_Contemporary_cost(){ //method that calculates the cost of each Table of style Contemporary
		int cost_chair = 0;
		int cost_center_piece = 0;
		int cost_place_setting = 0;
		
		for (int i=0; i<4;i++)
		{
			cost_chair = cost_chair + chair_arr[i].cost_of_contemporary_chair();
			
		}
		for (int i=0; i<1;i++)
		{
			cost_center_piece = cost_center_piece + center_piece_arr[i].cost_of_contemporary_center_piece();
			
		}
		for (int i=0; i<4;i++)
		{
			cost_place_setting = cost_place_setting + place_setting_arr[i].cost_of_contemporary_place_setting();
			
		}
		int cost_of_each_table_setting = 0;
		cost_of_each_table_setting = cost_chair + cost_center_piece + cost_place_setting;
		System.out.println("Cost of Contemporary Chairs in Each Table " +cost_chair);
		System.out.println("Cost of Contemporary Center_Piece in Each Table " +cost_center_piece);
		System.out.println("Cost of Contemporary Place Setting in Each Table " + cost_place_setting);
		return cost_of_each_table_setting;
	}
	
}
