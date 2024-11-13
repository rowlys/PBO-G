
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle
{
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
    protected String renter;
    protected boolean availability;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.renter = "";
        this.availability = true;
    }

    public abstract String getInfo();
    
    public void rent(){
        availability = false;
    }

    public void returned(){
        availability = true;
    }
    
    public boolean isAvailable(){
        return availability;
    }

}
