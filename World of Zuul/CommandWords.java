
/**
 * Write a description of class CommandWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommandWords
{
    private static final String[] commandList = {
        "go", "quit", "help"
    };
    
    public CommandWords(){
        // doesn't do anything
    }
    
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < commandList.length; i++){
            if(commandList[i].equals(aString)){
                return true;
            }
        }
        
        return false;
    }
}
