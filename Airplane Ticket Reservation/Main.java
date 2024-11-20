public class Main
{
    public static void main(String[] args) {
        Ticket economyTicket = new Economy(1000.00, 20, "New York");
        Ticket businessTicket = new Business(2000, 30, "New Orleans");
        Ticket firstClassTicket = new FirstClass(5000, 40, "Los Angeles");

        System.out.println("Economy Ticket Details:");
        economyTicket.displayInfo();

        System.out.println("\nBusiness Ticket Details:");
        businessTicket.displayInfo();

        System.out.println("\nFirst Class Ticket Details:");
        firstClassTicket.displayInfo();
    }
}
