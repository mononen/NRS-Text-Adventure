import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

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
	private ArrayList<Weapon> weapons = new ArrayList<>();
	public Runner()
	{
		//initializing all of the items
		/////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>print these through your text box.<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		weapons.add(new Sniper());
		weapons.add(new DMR());
		weapons.add(new Handgun());
		weapons.add(new Rifle());
		weapons.add(new Knife());
	}
	
	public static void Evaluate(Label label, String input)
	{
		if(input.contains("y"))
		{
			label.setText("Allrighty then!! LETS'A GO!  :)");
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
		this.weapons = weapons;
	}
}
