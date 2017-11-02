import java.util.ArrayList;
import org.eclipse.swt.widgets.Label;
/*
 * this class runs the program.
 * This game is a classic Zork style text adventure.
 * 
 */

public class Runner 
{


	
	//private static Label TmpLabel;
	public static void main(String[] args)
	{
		Splash splash = new Splash();
		splash.stayFrosty();
		splash.enceLogo();
		//MainWnd MainWindow = new MainWnd();
		//Gameplay gameplay = new Gameplay(MainWindow);
	}

	
	/*public Runner()
	{
		//initializing all of the items

	}
	
	public void Evaluate(Label label, String input)
	{
		if(input.contains("y"))
		{
			label.setText("Allrighty then!! LETS'A GO!  :)");
			Wait(1);
			label.setText("Printing the required programming homework arraylist.");
			Wait(1);
			System.out.println(this.building.toString());
		}
		else
		{
			label.setText("UH-OH!!!! THERE WAS A PROBLEM!!!");
		}
	}*/
	
/*	public ArrayList<Weapon> getWeapons() 
	{
		return weapons;
	}
	
	public void setWeapons(ArrayList<Weapon> weapons) 
	{
		this.weapons = weapons;
	}*/
	
	
	public void Wait(double timer)
	{
		try {
            Thread.sleep((long) (timer*1000));
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
}
