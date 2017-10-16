import java.util.ArrayList;

public class Room 
{
	private static ArrayList<Consumable> Consumables = new ArrayList<>();
	private static ArrayList<Utility> Utilities = new ArrayList<>();
	private static ArrayList<Animal> Animals = new ArrayList<>();
	private static ArrayList<Weapon> Weapons = new ArrayList<>();
	
	public Room()
	{
		//zero arg constructor with zero construction???
		//is this legal
	}
	
	//adding of weapons and animals have to be done manually, because of amount of children.
	public Room(int consumables, int utilities)
	{
		for (int i = 0; i < consumables; i++)
		{
			Consumables.add(new Consumable());
		}
		for (int i = 0; i < utilities; i++)
		{
			Utilities.add(new Utility());
		}
	}
	
	public static ArrayList<Consumable> getConsumables() 
	{
		return Consumables;
	}
	public static void setConsumables(ArrayList<Consumable> consumables) 
	{
		Consumables = consumables;
	}
	public void addConsumables(int consumables)
	{
		for (int i = 0; i < consumables; i++)
		{
			Consumables.add(new Consumable());
		}
	}
	public Consumable getConsumable(int index)
	{
		return Consumables.get(index);
	}
	public void addConsumable(Consumable consumable)
	{
		Consumables.add(consumable);
	}
	
	
	public static ArrayList<Weapon> getWeapons() 
	{
		return Weapons;
	}
	public static void setWeapons(ArrayList<Weapon> weapons) 
	{
		Weapons = weapons;
	}
	public void addWeapons(int weapons)
	{
		for (int i = 0; i < weapons; i++)
		{
			Weapons.add(new Weapon());
		}
	}
	public Weapon getWeapon(int index)
	{
		return Weapons.get(index);
	}
	public void addWeapon(Weapon weapon)
	{
		Weapons.add(weapon);
	}
	
	
	public static ArrayList<Utility> getUtilities() 
	{
		return Utilities;
	}
	public static void setUtilities(ArrayList<Utility> utilities) 
	{
		Utilities = utilities;
	}
	public void addUtilities(int utilities)
	{
		for (int i = 0; i < utilities; i++)
		{
			Utilities.add(new Utility());
		}
	}
	public Utility getUtility(int index)
	{
		return Utilities.get(index);
	}
	public void addUtility(Utility utility)
	{
		Utilities.add(utility);
	}
	
	
	public static ArrayList<Animal> getAnimals() 
	{
		return Animals;
	}
	public static void setAnimals(ArrayList<Animal> animals) 
	{
		Animals = animals;
	}
	public void addAnimals(int animals)
	{
		for (int i = 0; i < animals; i++)
		{
			Animals.add(new Animal());
		}
	}
	public Animal getAnimal(int index)
	{
		return Animals.get(index);
	}
	public void addAnimal(Animal animal)
	{
		Animals.add(animal);
	}
	
	public String toString()
	{
		return "consumables: " + Consumables.toString() + ", Utilities: " + Utilities.toString() + ", Animals: " + Animals.toString() + ", Weapons: " + Weapons.toString();
	}
}
