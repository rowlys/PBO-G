
/**
 * Write a description of class Bid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bid
{
    private Person bidder;
    private int bid;
    
    /**
     * Constructor for objects of class Bid
     */
    public Bid(Person bidder, int bid)
    {
        this.bidder = bidder;
        this.bid = bid;
    }

    public int getBid()
    {
        return bid;
    }
    
    public String getBidder()
    {
        return bidder.getName();
    }
}
