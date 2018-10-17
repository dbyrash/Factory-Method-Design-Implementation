
public class Place_Setting_factory extends Table_Setting {
	
	public Place_Setting_factory()		// declaration of this variable inside Place_setting_factory will not effect other classes.
	{
		this.base_cost_price = 20;
	}

	public int cost_of_vintage_place_setting(){
		
		return this.base_cost_price + 40;
	}
	public int cost_of_modern_place_setting(){
		
		return this.base_cost_price + 30;
	}
	public int cost_of_contemporary_place_setting(){
	
	return this.base_cost_price + 20;
}
}
