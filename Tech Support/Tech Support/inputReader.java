import java.util.HashSet;
import java.util.Scanner;

/**
 * Write a description of class inputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inputReader
{
    private Scanner reader;

    /**
     * Constructor for objects of class inputReader
     */
    public inputReader()
    {
        reader = new Scanner(System.in);
    }

    public String getInput()
    {
        System.out.print("> ");         
        String inputLine = reader.nextLine();

        return inputLine;
    }
}
