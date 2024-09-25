
/**
 * Write a description of class display here.
 *
 * Basten Andika Salim - 5025231132
 * @version (a version number or a date)
 */
public class display
{
    // instance variables - replace the example below with your own
    private int counter;

    /**
     * Constructor for objects of class display
     */
    public display()
    {
        counter = 0;
    }

    
    public void displayResult(double result)
    {
        counter++;
        System.out.println("Kalkulasi ke-" + counter + " = " + result);
    }
}
