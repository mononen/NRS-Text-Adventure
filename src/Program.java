public class Program {
	public static boolean isRunning = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //kitchen generation
        //you enter an old dilapated kitchen. There is a bottle on the table and a door in front of you
        Room Kitchen = new Room();
        {
            //Kitchen.prev is null
            Kitchen.name = "KITCHEN";
            Kitchen.description.start = "an old dilapated kitchen. ";
            Kitchen.item1.name = "bottle";
            Kitchen.item1.description = "a bottle ";
            Kitchen.item1.location = "on the table and ";
            Kitchen.door.position = "a door in front of you.";
            Kitchen.door.CmdDir = "forward";
        }
        Room Bedroom = new Room();
        {
            Bedroom.name = "BEDROOM";
            Bedroom.description.start = "a dark and nearly empty bedroom with a table in the middle and a bed pushed to the side. ";
            Bedroom.item1.name = "sack";
            Bedroom.item1.description = "a wool sack ";
            Bedroom.item1.location = "on the table ";
            Bedroom.door.position = "a door to your left.";
            Bedroom.door.CmdDir = "left";
        }
        Room Closet = new Room();
        {
            Closet.name = "CLOSET";
            Closet.description.start = "a dimly lit closet .";
            Closet.item1.name = "flashlight";
            Closet.item1.description = "a flashlight ";
            Closet.item1.location = "on the floor ";
            Closet.door.position = "a trapdoor in the floor.";
            Closet.door.CmdDir = "below";
        }

        Kitchen.forward = Bedroom;
        Bedroom.left = Closet;
        //player generation
        Player player = new Player();
        player.hp = 100;
        System.out.println("welcome!");
        System.out.println("I hope that this works!");
        //System.out.println("before you can get started, what is your name?");
        //String KeyIn = Input.getInput();
        //KeyIn = player.name;
        //System.out.println("OK, your name is " + player.name + "?");
        System.out.println("Oh! I almost forgot! All the commands that you will need to know to win!");
        System.out.println("Type 'quit' at any time to quit.");
        System.out.println("Type 'inventory' at any time to see what items you possess.");
        System.out.println("Type 'look around' at any time to see what is around you.");
        System.out.println("Type 'has been' to at any time to see where you have been so far.");
        System.out.println("Type 'back' to return to the previous room (if you can)");
        System.out.println("Type 'clear' to clear the console.");
        System.out.println("Good luck!");
        while (isRunning)
        {
            Kitchen.Display(Kitchen, player);
        }

	}

}
