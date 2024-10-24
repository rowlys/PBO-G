/**
 * ETS PBO G - Nomor 2
 *
 * @author Basten Andika Salim - 5025231132
 *
 */

public class ParkingTicketMachine
{
    private int balance, ticketPrice, ticketTime;

    public ParkingTicketMachine(int balance, int ticketPrice)
    {
        this.balance = balance;
        this.ticketPrice = ticketPrice;
        ticketTime = 0;
    }

    public void insertMoney(int amount)
    {
        if (amount <= 0){
            System.out.println("Amount entered is invalid. Please try again.");
            return;
        }
        
        balance += amount;
        
        System.out.println(amount + " dollars have been added to your balance.");
        System.out.println("Total balance: " + balance);
    }
    
    public void issueTicket(){
        if (balance < ticketPrice){
            System.out.println("Insufficient funds. Please try again.");
            return;
        }
        
        int temp = balance / ticketPrice;
        
        balance -= temp * ticketPrice;
        ticketTime += temp;
        
        System.out.println("You have funds for " + temp + " hours of parking.");
        System.out.println();
    
        System.out.println("============================================================");
        System.out.println();
        System.out.println(temp + " have been added to your total purchased parking time.");
        System.out.println("Your purchased parking time is: " + ticketTime + " hour(s).");
        System.out.println();
        System.out.println("============================================================");
    }
    
    public void getTimePurchased(){
        System.out.println("============================================================");
        System.out.println();
        System.out.println("Your purchased parking time is: " + ticketTime + " hour(s).");
        System.out.println();
        System.out.println("============================================================");
    }
}
