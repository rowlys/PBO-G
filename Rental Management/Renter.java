
/**
 * Write a description of class Renter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Renter
{
    private String name;
    private Vehicle vehicle;
    private boolean renting;

    public Renter(String name, Vehicle vehicle)
    {
        this.name = name;
        this.vehicle = vehicle;
        renting = true;
    }
    
    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public void returnVehicle(){
        vehicle.returned();
        vehicle = null;
        renting = false;
    }
    
    public boolean isRenting(){
        return renting;
    }
}
