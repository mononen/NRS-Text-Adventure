public class Gun extends Weapon
{
	//attributes
	private double caliber;
	private int ammo;
	private boolean isAutomatic;
	private boolean isSupressed;
	
	//constructor
	public Gun()
	{
		super.setArmorPenetration(.9);
		this.isAutomatic = false;
		super.setWearMultiplier(1);
		super.setStealth(0);
		this.isSupressed = false;
	}
	//mutator
	public double getCaliber()
	{
		return this.caliber;
	}
	public int getAmmo()
	{
		return this.ammo;
	}
	public boolean getIsAutomatic()
	{
		return this.isAutomatic;
	}
	public boolean getIsSupressed() 
	{
		return this.isSupressed;
	}
	public void setCaliber(double caliber)
	{
		this.caliber = caliber;
	}
	public void setAmmo(int ammo)
	{
		this.ammo = ammo;
	}
	public void setIsAutomatic(boolean isAutomatic)
	{
		this.isAutomatic = isAutomatic;
	}
	public void setIsSupressed(boolean isSupressed)
	{
		this.isSupressed = isSupressed;
	}
	public String toString()
	{
		return super.toString() + "bullets" + this.ammo + "supressor" + this.isSupressed + "is automatic" + this.isAutomatic + "armor penetration" + super.getArmorPenetration() + "caliber"+ this.caliber + "effective range" + super.getEffectiveRange() + "damage" + super.getAtkDmg() + "weight" + this.getWeight() + "aim time" + super.getAimTime();
	}
}
