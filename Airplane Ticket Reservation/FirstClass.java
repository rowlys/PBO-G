public class FirstClass extends Ticket
{
    public FirstClass(double fare, int baggage, String destination)
    {
        super(fare, baggage, destination);
        baggage += 10;
    }

    @Override
    public double calculateFare() {
        return getFare() * 1.5;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Final Fare: $" + calculateFare());
        System.out.println("Baggage Limit: " + (getBaggage()+10) + " kg");
        System.out.println("Service: Complementary meal, lounge access");
    }
}
