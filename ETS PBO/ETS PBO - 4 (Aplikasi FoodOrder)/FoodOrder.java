import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Basten Andika Salim
 * 
 */
public class FoodOrder
{
    private ArrayList<Pesan> orderList;
    private Scanner reader;
    
    public FoodOrder(){
        orderList = new ArrayList<>();
        reader = new Scanner(System.in);
    }
    
    public void state(){
        System.out.println("Enter 1 to order! Or 2 to say goodbye...");
        System.out.println("");
        
        
        String input;
        System.out.print("> ");
         
        input = reader.nextLine();
            
        if (input.equals("1")){
            newOrder();
        }
            
        else if (input.equals("2")){
            System.out.println("Please come again!");
            return;
        }
        
        else{
            System.out.println("Sorry, I didn't quite catch that.");
            System.out.println("");
            state();
        }
        
    }
    
    public void newOrder(){
        Pesan newPesan = new Pesan();
        
        newPesan.printMenu();
        
        System.out.println("Please input your order! Enter 'Quit' to finish your order!");
        while (true){
            String input;
            System.out.print("> ");
            
            input = reader.nextLine();
            
            if (input.equals("Quit") || input.equals("quit")){
                break;
            }
            
            newPesan.insertItem(input);
        }
        
        newPesan.gotPaid();
        
        orderList.add(newPesan);
        
        state();
    }
    
    public void printAllOrder(){
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println("Order #" + (i+1) + ":");
            orderList.get(i).printOrder();
            
            System.out.println();
        }
    }
}
