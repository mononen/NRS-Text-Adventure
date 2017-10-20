import java.util.ArrayList;
import java.util.Random;


public class Gameplay 
{
	ArrayList<Building> buildings = new ArrayList<>();
	Map map = new Map();
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
		Player player = new Player();
		ArrayList<Animal> animals = new ArrayList<>();
		ArrayList<Weapon> weapons = new ArrayList<>();
		
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
		
		buildings.add(new Building(2));
		buildings.get(0).getFloor(0).addRooms(2);
		//building.addFloors(1);
		buildings.get(0).getFloor(1).addRooms(2);
		buildings.get(0).getFloor(1).getRoom(0).addWeapon(new Rifle());
		buildings.get(0).getFloor(1).getRoom(1).addAnimal(new Human("Bozo", "clown"));
		buildings.get(0).getFloor(0).getRoom(0).addAnimal(new Human("JOIJIO", "lkadsf"));
		
		this.mainwindow.SetupObject(buildings, player);
		
	}
	
	public void turn()
	{
		String input = mainwindow.getText().getText();
		
		if (input.contains("right"))
		{
			int i1 = player.getPosition(0) + 1;
			int i2 = player.getPosition(1);
			
			
		}
	}
}
