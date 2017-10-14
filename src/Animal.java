public class Animal 
{
	private String name;
	private String species;
	private int atkDmg;
	private int health;
	private boolean isAlive;
	private String temperament;
	private double hostility;
	
	public Animal()
	{
		this.health = 100;
		this.isAlive = true;
		this.temperament = "Normal";
	}
	
	public Animal(String name, String species, int atkDmg, int health, boolean isAlive, String temperament)
	{
		this.name = name;
		this.species = species;
		this.atkDmg = atkDmg;
		this.health = health;
		this.isAlive = isAlive;
		this.temperament = temperament;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSpecies() 
	{
		return species;
	}
	public void setSpecies(String species) 
	{
		this.species = species;
	}
	public int getAtkDmg() 
	{
		return atkDmg;
	}
	public void setAtkDmg(int atkDmg) 
	{
		this.atkDmg = atkDmg;
	}
	public double getHealth() 
	{
		return health;
	}
	public void setHealth(int health) 
	{
		this.health = health;
	}
	public boolean isAlive() 
	{
		return isAlive;
	}
	public void setAlive(boolean isAlive) 
	{
		this.isAlive = isAlive;
	}
	public void checkAlive()
	{
		if(this.atkDmg <= 0)
		{
			this.isAlive = false;
		}
	}
	public String toString()
	{
		return "Name: " + this.name + ", Species: " + this.species + ", Attack Damage: " + this.atkDmg + ", Health: " + this.health + ", Temperament: " + this.temperament + ", Hostility: " + this.hostility;
	}
	public String getTemperament() 
	{
		return temperament;
	}
	public void setTemperament(String temperament) 
	{
		this.temperament = temperament;
	}
	public double getHostility() 
	{
		return hostility;
	}
	public void setHostility(double hostility) 
	{
		this.hostility = hostility;
	}
}
