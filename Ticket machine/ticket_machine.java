
/**
 * Write a description of class ticket_machine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ticket_machine
{
    private int price;
    private int balance;
    private int total;
    public ticket_machine(int ticketCost)
    {
        if (ticketCost > 0){
            price = ticketCost;
        }
        
        else {
            price = 20;
        }
        
        balance = 0;
        total = 0;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void insertMoney(int amount){
        if (amount > 0) {
            balance += amount;
        }
        
        else {
            System.out.println("Use a positive amount!");
        }
    }
    
    public void printTicket(){
        if (balance >= price){    
            System.out.println("##########################");
            System.out.println("#     The BlueJ Line     #");
            System.out.println("#          Ticket        #");
            System.out.println("# " + price + " cents               #");
            System.out.println("##########################");
            System.out.println();
            
            total += price;
            balance -= price;
        }
        
        else {
            System.out.println("You are " + (price-balance) + " cents short.");
        }
    }
}
