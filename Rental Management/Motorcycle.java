
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    int wheels;
    
    public Motorcycle(String brand, String model, int year, int wheels)
    {
        super(brand, model, year);
        this.wheels = wheels;
    }
    
    @Override
    public String getInfo(){
        return "A " + year + " "+ model + " " + brand + " " + " motorcycle. It has " + wheels + " wheels";
    }
}
