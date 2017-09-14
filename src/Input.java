import java.util.Scanner;

class Input
    {
        public static String getInput()
        {
            //prints cursor
            System.out.println("> ");
            Scanner scanner = new Scanner(System.in);
            String SysIn = scanner.nextLine();
            String Input = SysIn;
            String Parsed = Input.toLowerCase();
            return Parsed;
        }
        //general parsing
        //not to process anything specific
        public static String Parser(String KeyIn)
        {
            if (KeyIn.contains("south"))
            {
                return "south";
            }
            else if (KeyIn.contains("east"))
            {
                return "east";
            }
            else if (KeyIn.contains("north"))
            {
                return "north";
            }
            else if (KeyIn.contains("west"))
            {
                return "west";
            }
            else if (KeyIn.contains("left"))
            {
                return "left";
            }
            else if (KeyIn.contains("forward"))
            {
                return "forward";
            }
            else if (KeyIn.contains("backward"))
            {
                return "backward";
            }
            else if (KeyIn.contains("look"))
            {
                return "look";
            }
            else if (KeyIn.contains("quit") || KeyIn.equals("end"))
            {
                return "quit";
            }
            else if (KeyIn.contains("been"))
            {
                return "has been";
            }
            else if (KeyIn.contains("inventory") || KeyIn.contains("inv"))
            {
                return "inv";
            }
            else if (KeyIn.contains("clear") || KeyIn.equals("clr"))
            {
                return "clr";
            }
            else if (KeyIn.contains("back"))
            {
                return "back";
            }
            else
            {
                return "weeeee";
            }
        }

    }