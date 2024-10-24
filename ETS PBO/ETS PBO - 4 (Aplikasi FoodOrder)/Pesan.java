import java.util.ArrayList;
/**
 *
 * @author Basten Andika Salim
 * 
 */
public class Pesan
{
    private Menu menuList;
    private int totalPrice;
    private boolean isPaid;
    private ArrayList<String> orderedItems;
    
    public Pesan(){
        menuList = new Menu();
        totalPrice = 0;
        isPaid = false;
        
        orderedItems = new ArrayList<>();
    }
    
    public void insertItem(String item){
        int index = menuList.getItemIndex(item);
        
        if (index == -1){
            System.out.println("That is not on our menu :(");
            System.out.println("");
            return;
        }
        
        orderedItems.add(item);
        totalPrice += menuList.getPrice(index);
        
        System.out.println("A " + item + " is added to your order!");
        System.out.println("");
        
    }
    
    public void printOrder(){
        
        
        for (int i = 0; i < orderedItems.size(); i++) {
            System.out.println(orderedItems.get(i));
        }
        
        System.out.println("Total price: " + totalPrice);
    }
    
    public void printMenu(){
        menuList.printMenu();
    }
    
    public void gotPaid(){
        isPaid = true;
    }
}
