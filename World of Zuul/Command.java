
/**
 * Write a description of class Command here.
 *
 * @author Basten Andika Salim - 5025231132
 * @version 1.0
 */
public class Command
{
    private String firstWord;
    private String secondWord;
    
    public Command(String command, String secondWord)
    {
        firstWord = command;
        this.secondWord = secondWord;
    }
    
    public String getCommandWord()
    {
        return firstWord;
    }
    
    public String getSecondWord()
    {
        return secondWord;
    }
    
    public boolean isUnknown()
    {
        return (firstWord == null);
    }
    
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
