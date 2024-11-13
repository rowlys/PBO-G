
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    String type;
    
    public Bike(String brand, String model, int year, String type)
    {
        super(brand, model, year);
        this.type= type;
    }
    
    @Override
    public String getInfo(){
        return "A " + year + " "+ model + " " + brand + " " + " bike. It is a" + type + " bike";
    }
}
