public class Rifle extends Gun
{
	public Rifle()
	{
		super.setCaliber(.336);
		super.setMaximumPenetratableArmor('3', 'B');
		super.setArmorPenetration(.6);
		super.setRechargeTime(.2);
		super.setAtkDmg(15);
		super.setAimTime(1.5);
	}
}
