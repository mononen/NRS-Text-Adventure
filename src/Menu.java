import java.util.ArrayList;

public class Menu
{	
	private ArrayList<String> list = new ArrayList<>();
	
	public Menu()
	{
		list.add("this is the menu!");
	}
	public void Display()
	{
		for(int i = 0;i< list.size(); i++)
		{
			String x = list.get(i);
			System.out.println(x + ", ");
		}
	}
}
