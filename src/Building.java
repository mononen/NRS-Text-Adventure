import java.util.ArrayList;

public class Building 
{
	private static ArrayList<Floor> Floors = new ArrayList<>();
	
	public Building()
	{
		Floors.add(new Floor());
	}
	public Building(int floors)
	{
		for (int i = 0; i < floors; i++)
		{
			Floors.add(new Floor());
		}
	}

	public static ArrayList<Floor> getFloors() 
	{
		return Floors;
	}
	//for returning a specific floor
	public Floor getFloor(int index)
	{
		return Floors.get(index);
	}

	public static void setFloors(ArrayList<Floor> floors) 
	{
		Floors = floors;
	}
	public static void addFloors(int floors)
	{
		for (int i = 0; i < floors; i++)
		{
			Floors.add(new Floor());
		}
	}
	public String toString()
	{
		String s = null;
		for (int i = 0; i < Floors.size(); i++)
		{
			s += Floors.get(i).toString();
		}
		return s;
	}
}
