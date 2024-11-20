public class Economy extends Ticket
{

    public Economy(double fare, int baggage, String destination)
    {
        super(fare, baggage, destination);
    }

    @Override
    public double calculateFare() {
        return getFare() * 0.9;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Final Fare: $" + calculateFare());
        System.out.println("Baggage Limit: " + getBaggage() + " kg");
        System.out.println("No additional service.");
    }
}
