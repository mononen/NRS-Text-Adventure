import java.util.ArrayList;
import java.util.Random;

public class Gameplay 
{
	ArrayList<Building> buildings = new ArrayList<>();
	Player player = new Player();
	MainWnd mainwindow;
	public Gameplay(MainWnd mainwindow)
	{
		this.mainwindow = mainwindow;
		init();
	}
	public void init()
	{
		Random random = new Random();
		ArrayList<Animal> animals = new ArrayList<>();
		ArrayList<Weapon> weapons = new ArrayList<>();
		Building building;
		
		weapons.add(new Sniper());
		weapons.add(new DMR());
		weapons.add(new Handgun());
		weapons.add(new Rifle());
		weapons.add(new Knife());
		
		animals.add(new Human("Steve"));
		animals.add(new Human("Bonzo", "cook"));
		//animals.add(new Human("Bozo", "clown"));
		animals.add(new Human("Kai", "programmer"));
		animals.add(new Human("Alex", "annihilator"));
		animals.add(new Human("Kayden"));
		animals.get(0).setTemperament("barbarian");
		animals.get(3).setTemperament("relaxed");
		animals.get(4).setTemperament("lunatic");
		
		building = new Building(2);
		building.getFloor(0).addRooms(2);
		//building.addFloors(1);
		building.getFloor(1).addRooms(2);
		building.getFloor(1).getRoom(0).addWeapon(new Rifle());
		building.getFloor(1).getRoom(1).addAnimal(new Human("Bozo", "clown"));
		building.getFloor(0).getRoom(0).addAnimal(new Human("JOIJIO", "lkadsf"));
		
		this.mainwindow.
		
	}
	
	public void turn()
	{
		
	}
}
