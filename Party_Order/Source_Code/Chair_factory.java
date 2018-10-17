
public class Chair_factory extends Table_Setting {
	public Chair_factory()
	{
		this.base_cost_price = 50;  // declaration of this variable inside Chair_factory will not effect other classes.
	}
	public int cost_of_vintage_chair()
	{
		return this.base_cost_price+ 50;
	}
	public int cost_of_modern_chair()
	{
		return this.base_cost_price + 100;
	}
	public int cost_of_contemporary_chair()
	{
		return this.base_cost_price+ 20;
	}
}

