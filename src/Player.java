public class Player
{
    public String name;
    public int hp;
    public Item item1 = null;
    public Item item2 = null;
    public Item item3 = null;
    public Item item4 = null;
    public Item item5 = null;
    public void PrintInv(Room start, Player player)
    {
        //something that scans through all the rooms or items, and reports if a player has it or not
        System.out.println(start.name + " duh!");
        Boolean isRunning = true;
        while (isRunning)
        {
            while (start.forward != null && start.forward.hasVisit)
            {
                if (start.forward.item1.playerHas)
                {
                    System.out.println(start.forward.item1.name);
                }
                if (start.forward.item2.playerHas)
                {
                    System.out.println(start.forward.item2.name);
                }
                if (start.forward.item3.playerHas)
                {
                    System.out.println(start.forward.item3.name);
                }
                player.PrintInv(start.forward, player);
            }
            while (start.left != null && start.left.hasVisit)
            {
                if (start.left.item1.playerHas)
                {
                    System.out.println(start.left.item1.name);
                }
                if (start.left.item2.playerHas)
                {
                    System.out.println(start.left.item2.name);
                }
                if (start.left.item3.playerHas)
                {
                    System.out.println(start.left.item3.name);
                }
                player.PrintInv(start.left, player);
            }
            while(start.right != null && start.right.hasVisit)
            {
                if (start.right.item1.playerHas)
                {
                    System.out.println(start.right.item1.name);
                }
                if (start.right.item2.playerHas)
                {
                    System.out.println(start.right.item2.name);
                }
                if (start.right.item3.playerHas)
                {
                    System.out.println(start.right.item3.name);
                }
                player.PrintInv(start.right, player);
            }
            while(start.back != null && start.back.hasVisit)
            {
                if (start.back.item1.playerHas)
                {
                    System.out.println(start.back.item1.name);
                }
                if (start.back.item2.playerHas)
                {
                    System.out.println(start.back.item2.name);
                }
                if (start.back.item3.playerHas)
                {
                    System.out.println(start.back.item3.name);
                }
                player.PrintInv(start.back, player);
            }
            start.Display(start, player);
        }
    }
    public void PrintHis(Room start, Player player)
    {
        //something that scans through all the rooms, and reports if a player has been there or not
        //start has to have been visited
        System.out.println(start.name + "duh!");
        Boolean isRunning = true;
        while (isRunning)
        {
            while (start.forward != null && start.forward.hasVisit)
            {
                System.out.println(start.forward.name);
                player.PrintHis(start.forward, player);
            }
            while(start.left != null && start.left.hasVisit)
            {
                System.out.println(start.left.name);
                player.PrintHis(start.left, player);
            }
            while(start.right != null && start.right.hasVisit)
            {
                System.out.println(start.right.name);
                player.PrintHis(start.right, player);
            }
            while(start.back != null && start.back.hasVisit)
            {
                System.out.println(start.back.name);
                player.PrintHis(start.back, player);
            }
        }
    }
}