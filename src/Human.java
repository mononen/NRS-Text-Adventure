public class Human extends Animal
{
	public String profession;
	public Human()
	{
		super.setSpecies("Human");
	}
	public Human(String name)
	{
		super.setSpecies("Human");
		super.setName(name);
	}
	public Human(String name, String profession)
	{
		super.setName(name);
		this.profession = profession;
		this.setTemperament("regular");
	}
	public String toString()
	{
		return super.toString() + ", Profession: " + this.profession;
	}
}
