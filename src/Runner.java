import java.util.ArrayList;
import org.eclipse.swt.widgets.Label;
/*
 * 
 * this class runs the program.
 * 
 */

public class Runner 
{
	/*
	public static void main(String[] args)
	{
		//call splash object
		Splash splash = new Splash();
		//Call splash screen
		splash.splashScreen();
		splash.fightSplash();
		Knife knife = new Knife();
		Weapon[] weaponArray = {knife};
		System.out.println(weaponArray[0]);
	}
//*/
	//private static Label TmpLabel;
	public static void main(String[] args)
	{
		MainWnd MainWindow = new MainWnd();
	}
	private static ArrayList<Animal> animals = new ArrayList<>();
	private static ArrayList<Weapon> weapons = new ArrayList<>();
	private static Building building;
	public Runner()
	{
		//initializing all of the items
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
		building.getFloor(1).getRoom(1).addWeapon(new Rifle());
		building.getFloor(1).getRoom(2).addAnimal(new Human("Bozo", "clown"));
		building.getFloor(0).getRoom(0).addAnimal(new Human("JOIJIO", "lkadsf"));
	}
	
	public static void Evaluate(Label label, String input)
	{
		if(input.contains("y"))
		{
			label.setText("Allrighty then!! LETS'A GO!  :)");
			Wait(1);
			label.setText("Printing the required programming homework arraylist.");
			Wait(1);
			System.out.println(building.toString());
		}
		else
		{
			label.setText("UH-OH!!!! THERE WAS A PROBLEM!!!");
		}
	}
	
	public ArrayList<Weapon> getWeapons() 
	{
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons) 
	{
		Runner.weapons = weapons;
	}
	public static void Wait(double timer)
	{
		try {
            Thread.sleep((long) (timer*1000));
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
}
