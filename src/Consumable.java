//consumables are one time use, like food
public class Consumable 
{
	private double weight;
	private double healthRestored;
	private double useTime;
	private double nname;
	public double getWeight() 
	{
		return this.weight;
	}
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}
	public double getHealthRestored() 
	{
		return this.healthRestored;
	}
	public void setHealthRestored(double healthRestored) 
	{
		this.healthRestored = healthRestored;
	}
	public double getUseTime() 
	{
		return this.useTime;
	}
	public void setUseTime(double useTime) 
	{
		this.useTime = useTime;
	}
	public double getNname() 
	{
		return this.nname;
	}
	public void setNname(double nname) 
	{
		this.nname = nname;
	}
}
