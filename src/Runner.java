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
	private static MainWnd MainWindow;
	//private static Label TmpLabel;
	private static Text TmpTxt;
	public static void main(String[] args)
	{
		MainWindow = new MainWnd();
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
	
	public void Logic2(String input)
	{
		Label label = new Label(MainWindow.getShell(), SWT.NONE);
		if(input.contains("y"))
		{
			
		}
	}
	
	public static void testing()
	{
		MainWindow.setLabelText("WEEEE-WOOOOO");
		/*
		Label TmpLabel = new Label(MainWindow.getShell(), SWT.NONE);
		TmpLabel = MainWindow.getLabel();
		String TMP = TmpLabel.getText();
		
		if(MainWindow.getLabel().getText().contains("y"))
		{
			MainWindow.setLabelText("Allrighty then!! LETS'A GO!  :)");
		}
		else
		{
			MainWindow.setLabelText("UH-OH!!!! THERE WAS A PROBLEM!!!");
		}
		*/
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
