import java.util.ArrayList;

/*
 * 
 * this class runs the program.
 * 
 */

public class Runner 
{
	///*
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
}
