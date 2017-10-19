import java.util.ArrayList;

public class Player 
{
	private ArrayList<Weapon> weapons = new ArrayList<>();
	private ArrayList<Consumable> consumables = new ArrayList<>();
	private ArrayList<Utility> Utility = new ArrayList<>();
	private double hp;
	private double agility;
	private double weight;
	private double maxweight;
	public Player()
	{
		this.maxweight = 70;
	}
	public ArrayList<Weapon> getWeapons() 
	{
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons)
	{
		this.weapons = weapons;
	}
	public ArrayList<Consumable> getConsumables() {
		return consumables;
	}
	public void setConsumables(ArrayList<Consumable> consumables) 
	{
		this.consumables = consumables;
	}
	public ArrayList<Utility> getUtility() 
	{
		return Utility;
	}
	public void setUtility(ArrayList<Utility> utility) 
	{
		Utility = utility;
	}
	public double getHp() 
	{
		return hp;
	}
	public void setHp(double hp) 
	{
		this.hp = hp;
	}
	public double getAgility() 
	{
		return agility;
	}
	public void setAgility(double agility) 
	{
		this.agility = agility;
	}
	public double getWeight() 
	{
		return weight;
	}
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}
	public double getMaxweight() 
	{
		return maxweight;
	}
	public void setMaxweight(double maxweight) 
	{
		this.maxweight = maxweight;
	}
}
