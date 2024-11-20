public abstract class Ticket
{
    private double fare;
    private int baggage;
    private String destination;

    public Ticket(double fare, int baggage, String destination)
    {
        this.fare = fare;
        this.baggage= baggage;
        this.destination = destination;
    }

    public double calculateFare()
    {
        return fare;
    }
    
    public double getFare()
    {
        return fare;
    }
    
    public int getBaggage()
    {
        return baggage;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public void displayInfo(){
        System.out.println("Ticket Details");
        System.out.println("==============");
        System.out.println("Destination: " + destination);
    }
}
