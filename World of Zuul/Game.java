
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private Parser parser;
    private Room currentRoom;

    public Game() 
    {
        createRooms();
        parser = new Parser();
    }
    
    private void createRooms()
    {
        Room bedroom, corridor, dining_room, balcony, kitchen, grand_hall;
      
        bedroom = new Room("inside your chamber.");
        corridor = new Room("in a corridor.");
        dining_room = new Room("in the dining room. It's not dinner time yet.");
        balcony = new Room("standing on your balcony. The weather's nice.");
        kitchen = new Room("inside the royal kitchen. The chefs aren't here.");
        grand_hall = new Room("in the Grand Hall. Your parents aren't here, however.");
        
        bedroom.setExits(null, corridor, null, balcony);
        corridor.setExits(grand_hall, null, dining_room, bedroom);
        dining_room.setExits(corridor, kitchen, null, null);
        balcony.setExits(null, bedroom, null, null);
        kitchen.setExits(null, null, null, dining_room);
        grand_hall.setExits(null, null, corridor, null);
        
        currentRoom = bedroom;
    }
    
    
    public void play() 
    {            
        printWelcome();
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("However, in this particular World of Zuul game, you are a prince or a princess. Whichever you like.");
        System.out.println("You are inside of the royal castle, with nothing to do.");
        System.out.println("Nothing but to wander around the palace of course!");
        System.out.println("Type 'help' if you need help!");
        System.out.println();
        System.out.println("You are " + currentRoom.getDescription());
        System.out.print("Exits: ");
        if(currentRoom.northExit != null) {
            System.out.print("north ");
        }
        if(currentRoom.eastExit != null) {
            System.out.print("east ");
        }
        if(currentRoom.southExit != null) {
            System.out.print("south ");
        }
        if(currentRoom.westExit != null) {
            System.out.print("west ");
        }
        System.out.println();
    }
    
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }

        return wantToQuit;
    }
    
    private void printHelp() 
    {
        System.out.println("You are bored and can only wander in your home.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
    }
    
    private void goRoom(Command command){
        if(!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        Room nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = currentRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = currentRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = currentRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println("You are " + currentRoom.getDescription());
            System.out.print("Exits: ");
            if(currentRoom.northExit != null) {
                System.out.print("north ");
            }
            if(currentRoom.eastExit != null) {
                System.out.print("east ");
            }
            if(currentRoom.southExit != null) {
                System.out.print("south ");
            }
            if(currentRoom.westExit != null) {
                System.out.print("west ");
            }
            System.out.println();
        }
    }
        
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;
        }
    }
}
