
/**
 * Write a description of class Lot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lot
{
    int id;
    String name;
    
    private Bid highestBid;

    public Lot(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public boolean newBid(Bid bid)
    {
        if (highestBid == null || bid.getBid() > highestBid.getBid()){
            highestBid = bid;
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public String toString(){
        if (highestBid == null){
            return "No current bid for the item : " + name;
        }
        return "Lot for the item: " + name + ", with current highest bidder being: " + highestBid.getBid() + " by " + highestBid.getBidder(); 
    }
}
