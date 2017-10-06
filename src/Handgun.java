public class Handgun extends Gun
{
	public Handgun()
	{
		super.setCaliber(.22);
		super.setMaximumPenetratableArmor('2', 'C');
		super.setRechargeTime(.75);
		super.setAimTime(2);
		super.setWeight(5.0);
		super.setAtkDmg(8);
	}
}
