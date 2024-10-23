import java.util.Scanner;

public class Parser
{
    private CommandWords commands;
    private Scanner reader;

    public Parser() 
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }
    
    public Command getCommand() 
    {
        String input;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        input = reader.nextLine();

        Scanner parse = new Scanner(input);
        if(parse.hasNext()) {
            word1 = parse.next();
            if(parse.hasNext()) {
                word2 = parse.next();      
            }
        }

        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2); 
        }
    }
}
