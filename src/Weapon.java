public class Weapon
{
	//attributes
	private int atkDmg;
	private int wear;
	private boolean isUsable;
	private int effectiveRange;
	private double weight;
	private double rechargeTime;
	private double wearMultiplier;
	private double stealth;
	private double armorPenetration;
	private char maximumPenetratableArmor[] = new char[2];
	private double aimTime;
	
	//constructors
	public Weapon()
	{
		this.isUsable = true;
		this.wear = 0;
		this.wearMultiplier = 1;
	}
	
	public Weapon(int atkDmg, int wear, boolean isUsable)
	{
		this.atkDmg = atkDmg;
		this.wear = wear;
		this.isUsable = isUsable;
	}
	
	//mutators
	//getters
	public int getAtkDmg()
	{
		return this.atkDmg;
	}
	public int getWear()
	{
		return this.wear;
	}
	public boolean getIsUsable()
	{
		return this.isUsable;
	}
	public int getEffectiveRange()
	{
		return this.effectiveRange;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getRechargeTime()
	{
		return this.rechargeTime;
	}
	public double getWearMultiplier()
	{
		return this.wearMultiplier;
	}
	public double getStealth()
	{
		return this.stealth;
	}
	public double getArmorPenetration()
	{
		return this.armorPenetration;
	}
	public char[] getMaximumPenetratableArmor()
	{
		return this.maximumPenetratableArmor;
	}
	public double getAimTime()
	{
		return this.aimTime;
	}
	//setters
	public void setAtkDmg(int atkDmg)
	{
		this.atkDmg = atkDmg;
	}
	public void setWear(int wear)
	{
		this.wear = wear;
	}
	public void setIsUsable(boolean isUsable)
	{
		this.isUsable = isUsable;
	}
	public void setEffectiveRange(int effectiveRange)
	{
		this.effectiveRange = effectiveRange;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public void setRechargeTime(double rechargeTime)
	{
		this.rechargeTime = rechargeTime;
	}
	public void setWearMultiplier(double wearMultiplier)
	{
		this.wearMultiplier = wearMultiplier;
	}
	public void setStealth(double stealth)
	{
		this.stealth = stealth;
	}
	public void setArmorPenetration(double armorPenetration)
	{
		this.armorPenetration = armorPenetration;
	}
	public void setMaximumPenetratableArmor(char number, char character)
	{
		this.maximumPenetratableArmor[0] = number;
		this.maximumPenetratableArmor[1] = character;
	}
	public void setAimTime(double aimTime)
	{
		this.aimTime = aimTime;
	}
	
	//to string method
	public String toString()
	{
		return "Attack damage: " + this.atkDmg + "\nWear of object: " + this.wear;
	}
}
