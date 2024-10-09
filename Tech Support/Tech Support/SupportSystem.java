
/**
 * Write a description of class SupportSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupportSystem
{
    private inputReader reader;
    private Responder responder;
    
    public SupportSystem()
    {
        reader = new inputReader();
        responder = new Responder();
    }

    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();

            if(input.toLowerCase().startsWith("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input.toLowerCase());
                System.out.println(response);
            }
        }
        printGoodbye();
    }
    
    public void printWelcome(){
        System.out.println("Welcome to the Basten's Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }
    
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Goodbye!");
    }
}
