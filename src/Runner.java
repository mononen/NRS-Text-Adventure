import java.util.ArrayList;
import org.eclipse.swt.widgets.Label;
import java.util.Scanner;
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
		//splash.stayFrosty();
		//splash.enceLogo();
		Menu menu = new Menu();
		Scanner input  = new Scanner(System.in);
		int option = 100; //holds user input for menu option
		do
		{
			menu.drawMenu();
			option = input.nextInt();
			menu.selection(option);
		}while(option != 5);
		MainWnd MainWindow = new MainWnd(1);
		Gameplay gameplay = new Gameplay(MainWindow);
	}	
	public void Wait(double timer)
	{
		try {
            Thread.sleep((long) (timer*1000));
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
}
