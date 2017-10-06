public class Knife extends Weapon
{
	//no attributes other than textures. But I don't know how to do that.
	//constructor
	public Knife()
	{
		super.setEffectiveRange(1);
		super.setRechargeTime(.5);
		super.setWeight(.2);
		super.setWearMultiplier(.8);
		super.setStealth(.1);
		super.setArmorPenetration(.3);
		super.setMaximumPenetratableArmor('2','B');
	}
	//no mutators
	//tostring method
	public String toString()
	{
		return super.toString() + "Issa kneif!";
	}
}
