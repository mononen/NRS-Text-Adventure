import java.util.ArrayList;

public class Menu
{	
	public Menu()
	{
		
	}
	
	//menu selection
	public void selection(int option)
	{
		switch(option)
		{
		case 1: System.out.println("HELLO THERE!");
		break;
		case 2: System.out.println("STARTING GAME!");
		break;
		case 3: System.out.println("WOOOOOOOOOOO!");
		break;
		case 4: System.out.println("AAAWOOOOOOGAAAAAAAAHHHH!");
		break;
		default:
			System.out.println("*spooky voice* good luck!");
			break;
		}
	}
	//draws the menu
	public void drawMenu()
	{
		System.out.println("this is the menu");
		System.out.println("1 - option 1 \n2 - option 2\n3 - option 3\n4 - option 4\n5 - exit");
	}
}
