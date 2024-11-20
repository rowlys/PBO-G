public class Business extends Ticket
{

    public Business(double fare, int baggage, String destination)
    {
        super(fare, baggage, destination);
    }

    @Override
    public double calculateFare() {
        return getFare() * 1.25;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Final Fare: $" + calculateFare());
        System.out.println("Baggage Limit: " + (getBaggage()+5) + " kg");
        System.out.println("Service: Complementary meal");
    }
}
