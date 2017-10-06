/*
 * 
 * this class runs the program.
 * 
 */

public class Runner 
{
	public static void main(String[] args)
	{
		//call splash object
		Splash splash = new Splash();
		//Call splashscreen
		splash.splashScreen();
		splash.fightSplash();
		Menu menu = new Menu();
		menu.Display();
		Knife knife = new Knife();
		Sniper sniper = new Sniper();
		Weapon weapons[] = new Weapon[2];
		Weapon weapons2[] = {knife, sniper};
		sniper.setAtkDmg(100);
		System.out.println(sniper);
	}
}
