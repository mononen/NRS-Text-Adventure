public class Room
{
    //should this be = null;, or = new ____();???
    public String name = null;
    public Room forward = null;
    public Room back = null;
    public Room left = null;
    public Room right = null;
    //object generation
    public Description description = new Description();
    public Item item1 = new Item();
    public Item item2 = new Item();
    public Item item3 = new Item();
    //if the player has been to the room before
    public Boolean hasVisit = false;
    //if the player is currently in the room
    public Boolean isIn = false;
    public Door door = new Door();
    public Door door2 = new Door();
    //don't have it set to static, otherwise it can't be called
    public void Display (Room room, Player player)
    {
        while (Program.isRunning && player.hp > 0)
        {
            System.out.println(room.name);
            room.isIn = true;
            if (hasVisit != true)
            {
                System.out.println("You enter " + room.description.start + "There is " + room.item1.description + room.item1.location + room.item2.description + room.item2.location + room.item3.description + room.item3.location + room.door.position);
            }
            room.hasVisit = true;
            String keyIn = Input.getInput();
            String parsed = Input.Parser(keyIn);
            if (keyIn.contains(room.item1.name))
            {
                room.item1.playerHas = true;
                System.out.println("You pick up the " + room.item1.name);
                room.item1.description = "";
                room.item1.location = "";
            }
            else if (keyIn.contains(room.item2.name))
            {
                room.item2.playerHas = true;
                System.out.println("You pick up the " + room.item2.name);
                room.item2.description = "";
                room.item2.location = "";
            }
            else if (keyIn.contains(room.item3.name))
            {
                room.item3.playerHas = true;
                System.out.println("You pick up the " + room.item3.name);
                room.item3.description = "";
                room.item3.location = "";
            }
            else if (keyIn.contains(room.door.CmdDir))
            {
                room.isIn = false;
                if (keyIn.contains("left"))
                {
                    room.left.Display(room.left, player);
                }
                if (keyIn.contains("right"))
                {
                    room.right.Display(room.right, player);
                }
                if (keyIn.contains("forward"))
                {
                    room.forward.Display(room.forward, player);
                }
                if (keyIn.contains("back"))
                {
                    room.back.Display(room.back, player);
                }
            }
            else if (parsed.equals("look"))
            {
                //not executing this code when run
                room.description.Print(room);
            }
            else if (parsed.equals("quit"))
            {
                Program.isRunning = false;
            }
            else if (parsed.equals("inv"))
            {
                player.PrintInv(room, player);
                //room.Display(room, player);
            }
            else if (parsed.equals("clr"))
            {
            	System.out.print("\033[H\033[2J");
            	System.out.flush();
            }
            else
            {
                System.out.println("err, not understood");
            }
        }
    }
}