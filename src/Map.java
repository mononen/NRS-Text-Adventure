//map contains the object positions
public class Map 
{
	private Zone aboveGround[][] = new Zone[25][25];
	private Zone belowGround[][] = new Zone[25][25];
	public Map()
	{
		
	}
	public Zone[][] getAboveGround() 
	{
		return aboveGround;
	}
	public void setAboveGround(Zone aboveGround[][]) 
	{
		this.aboveGround = aboveGround;
	}
	public Zone[][] getBelowGround() 
	{
		return belowGround;
	}
	public void setBelowGround(Zone belowGround[][]) 
	{
		this.belowGround = belowGround;
	}
}
