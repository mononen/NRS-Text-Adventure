public class Gun extends Weapon
{
	//attributes
	private double caliber;
	private int ammo;
	private boolean isAutomatic;
	
	//constructor
	public Gun()
	{
		super.setArmorPenetration(.9);
		this.isAutomatic = false;
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
	public String toString()
	{
		return super.toString() + "the caliber is: " + this.caliber + "it has " + this.ammo + " bullets.";
	}
}
