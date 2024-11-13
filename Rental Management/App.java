import java.util.Scanner;

public class App {
    
    private Rental rental;
    private Scanner scanner;
    
    public App() {
        rental = new Rental();
        scanner = new Scanner(System.in);
    }
    
    public void menu(){
        boolean exit = false;
        while (!exit) {
            System.out.println("Vehicle Rental System");
            System.out.println("---------------------");
            System.out.println("1. Add new vehicle");
            System.out.println("2. Add new renter");
            System.out.println("3. Return vehicle");
            System.out.println("4. Show all vehicles");
            System.out.println("5. Show all renters");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    addRenter();
                    break;
                case 3:
                    returnVehicle();
                    break;
                case 4:
                    rental.showVehicle();
                    break;
                case 5:
                    rental.showRenter();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    
    private void addVehicle() {
        System.out.print("Enter vehicle type (Car, Motorcycle, Bike): ");
        String type = scanner.nextLine();
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter production year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        Vehicle vehicle;
        if (type.equalsIgnoreCase("Car")) {
            System.out.print("Enter its wheel count: ");
            int wheels = scanner.nextInt();
            vehicle = new Car(brand, model, year, wheels);        
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            System.out.print("Enter its wheel count: ");
            int wheels = scanner.nextInt();
            vehicle = new Motorcycle(brand, model, year, wheels);
        } else if (type.equalsIgnoreCase("Bike")) {
            System.out.print("Enter bicycle type (e.g., BMX, Road): ");
            String bicycleType = scanner.nextLine();
            vehicle = new Bike(brand, model, year, bicycleType);
        } else {
            System.out.println("Unknown vehicle type.");
            return;
        }

        rental.addVehicle(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    private void addRenter() {
        System.out.print("Enter renter's name: ");
        String name = scanner.nextLine();
        Vehicle tempVehicle;
        while (true){
            rental.showVehicle();
            
            System.out.print("Enter vehicle's ID: ");
            int id= scanner.nextInt();
            
            tempVehicle = rental.getVehicle(id - 1);
            
            if (tempVehicle == null || !tempVehicle.isAvailable()){
                System.out.println("Vehicle is not available.");
                System.out.println();
            }
            
            else {
                Renter renter = new Renter(name, tempVehicle);
                rental.addRenter(renter);
                tempVehicle.rent();
                System.out.println("Renter added successfully.");
            
                break;
            }
            
            
        }
    }

    private void returnVehicle() {
        System.out.print("Enter renter's name to return vehicle: ");
        String name = scanner.nextLine();
        boolean temp = rental.returnVehicle(name);
        
        if (temp) {
            System.out.println("Vehicle successfully returned.");
            return;
        }
        
        else {
            System.out.println("No vehicle to return.");
            return;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }
}

