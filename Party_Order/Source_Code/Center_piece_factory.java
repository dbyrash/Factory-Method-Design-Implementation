
public class Center_piece_factory extends Table_Setting {
	
	public Center_piece_factory() //// declaration of this variable inside Center_Piece_factory will not effect other classes.
	{
		this.base_cost_price = 30;
	}
	public int cost_of_vintage_center_piece()
	{
		return this.base_cost_price+ 35;
	}
	public int cost_of_modern_center_piece()
	{
		return this.base_cost_price+ 40;
	}
	public int cost_of_contemporary_center_piece()
	{
		return this.base_cost_price+ 25;
	}
}
