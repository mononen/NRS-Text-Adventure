
public class Description
{
    public String start = "start";
    public String end = "end";
    public void Print (Room room)
    {
        if (room.hasVisit)
        {
            if (room.isIn)
            {
                System.out.println("You are in " + room.description.start + "There is " + room.item1.description + room.item1.location + room.item2.description + room.item2.location + room.item3.description + room.item3.location + room.door.position);
            }
            else
            {
                System.out.println("You enter " + room.description.start + "There is " + room.item1.description + room.item1.location + room.item2.description + room.item2.location + room.item3.description + room.item3.location + room.door.position);
            }
        }
        else
        {
            System.out.println("You enter " + room.description.start + "There is " + room.item1.description + room.item1.location + room.door.position);
        }
    }
}