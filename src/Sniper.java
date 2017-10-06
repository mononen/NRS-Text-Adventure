public class Sniper extends Gun
{
	public Sniper()
	{
		//is this necessary?
		super.setIsAutomatic(false);
		super.setArmorPenetration(.95);
		super.setMaximumPenetratableArmor('4', 'A');
		super.setCaliber(.50);
		super.setEffectiveRange(5000);
		super.setRechargeTime(4.0);
		super.setAtkDmg(40);
		super.setAimTime(5.0);
		super.setWeight(25.0);
	}
	public String toString()
	{
		return super.toString();
	}
}
