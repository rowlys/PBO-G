import java.util.ArrayList;

/**
 * Write a description of class Auction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Auction
{
    // instance variables - replace the example below with your own
    private ArrayList<Lot> lots;
    private int nextLotID;
    /**
     * Constructor for objects of class Auction
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotID = 0;
    }

    public void newLot(String name)
    {
        lots.add(new Lot(nextLotID, name));
        nextLotID++;
    }
    
    public void showLots(){
        if (lots.isEmpty()) {
            System.out.println("No lots available.");
            return;
        }
        for (Lot lot : lots){
            System.out.println(lot.toString());
        }
    }
    
    public void makeBid(int lotID, Person bidder, int theBid)
    {
        Lot theLot = getLot(lotID);
        
        if (theLot != null){
            Bid bid = new Bid(bidder, theBid);
            theLot.newBid(bid);
        }
        
    }
    
    public Lot getLot(int lotID)
    {
        if (lotID >= 0 && lotID < nextLotID){
            return lots.get(lotID);
        }
        
        return null;
    }
}
