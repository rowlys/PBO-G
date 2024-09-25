
/**
 * Write a description of class calculator here.
 *
 * @Basten Andika Salim - 5025231132
 * @version (a version number or a date)
 */
public class calculator
{
    private display disp;
    /**
     * Constructor for objects of class calculator
     */
    public calculator(display actualDisplay)
    {
        disp = actualDisplay;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addition(double input1, double input2)
    {
        disp.displayResult(input1 + input2);
    }
    
    
    public void substraction(double input1, double input2)
    {
        disp.displayResult(input1 - input2);
    }
    
    
    public void multiplication(double input1, double input2)
    {
        disp.displayResult(input1 * input2);
    }
    
    
    public void division(double input1, double input2)
    {
        if (input2 == 0){
            disp.displayResult(999999999999f);
        }
        
        disp.displayResult(input1/ input2);
        
    }
}
