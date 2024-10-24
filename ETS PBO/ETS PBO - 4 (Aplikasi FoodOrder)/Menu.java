import java.util.ArrayList;
/**
 *
 * @author Basten Andika Salim
 * 
 */
public class Menu
{
    private ArrayList<String> menuItems;
    private ArrayList<Integer> menuPrices;
    
    public Menu(){
        menuItems = new ArrayList<>();
        menuPrices = new ArrayList<>();
        
        menuItems.add("Burger");
        menuPrices.add(5);

        menuItems.add("Fries");
        menuPrices.add(2);

        menuItems.add("Soda");
        menuPrices.add(1);

        menuItems.add("Pizza");
        menuPrices.add(10);
    }
    
    public int getItemIndex(String item){
        if (menuItems.contains(item)){
            return menuItems.indexOf(item);
        }
        
        return -1;
    }
    
    public int getPrice(int index){
        return menuPrices.get(index);
    }
    
    public void printMenu(){
        System.out.println("Here is our menu. Take your time!");
        System.out.println();
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i+1) + ". " + menuItems.get(i));
        }
    }
}
