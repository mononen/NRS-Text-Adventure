import java.util.ArrayList;

public class Floor 
{
	private static ArrayList<Room> Rooms = new ArrayList<>();
	//zero arg gives 1 room
	public Floor()
	{
		Rooms.add(new Room());
	}
	public Floor(int rooms)
	{
		for (int i = 0; i < rooms; i++)
		{
			Rooms.add(new Room());
		}
	}
	public void setRooms(ArrayList<Room> rooms)
	{
		Rooms = rooms;
	}
	public ArrayList<Room> getRooms()
	{
		return Rooms;
	}
	public Room getRoom(int index)
	{
		return Rooms.get(index);
	}
	public void addRooms(int rooms)
	{
		for (int i = 0; i < rooms; i++)
		{
			Rooms.add(new Room());
		}
	}
	public String toString()
	{
		String s = null;
		for (int i = 0; i < Rooms.size(); i++)
		{
			s += Rooms.get(i).toString();
		}
		return s;
	}
}
