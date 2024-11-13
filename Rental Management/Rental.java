import java.util.ArrayList;

public class Rental {
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Renter> renterList;

    public Rental() {
        vehicleList = new ArrayList<>();
        renterList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void addRenter(Renter renter) {
        renterList.add(renter);
    }

    public void showVehicle() {
        int vehicleID = 1;
        System.out.println("Available vehicle(s):");
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.isAvailable()){
                System.out.println("ID: " + vehicleID); 
                System.out.println(vehicle.getInfo());
                System.out.println();
            }
            vehicleID++;
        }
    }

    public void showRenter() {
        System.out.println("List of Renters:");
        for (Renter renter : renterList) {
            System.out.println("Name: " + renter.getName());
            if (!renter.isRenting()){
                System.out.println("This person is not renting.");
                return;
            }
            
            System.out.println("Rented vehicle: " + renter.getVehicle().getInfo());
        }
    }
    
    public Vehicle getVehicle(int id){
        return vehicleList.get(id);
    }
    
    public boolean returnVehicle(String name){
        for (Renter tempRenter : renterList) {
            if (tempRenter.getName().equals(name)){
                tempRenter.returnVehicle();
                return true;
            }
        }
        
        return false;
    }
}
