import java.util.ArrayList;

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
	private ArrayList<Weapon> weapons = new ArrayList<>();
	public Runner()
	{
		//initializing all of the items
		weapons.add(new Sniper());
		weapons.add(new DMR());
		weapons.add(new Handgun());
		weapons.add(new Rifle());
		weapons.add(new Knife());
	}
	public String logic(String input)
	{
		if (input.contains("y"))
		{
			return "Let's have some fun!:)";
		}
		else
		{
			return "Not understood!";
		}
	}
	public ArrayList<Weapon> getWeapons() 
	{
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons) 
	{
		this.weapons = weapons;
	}
}
