
/**
 * Write a description of class Hewan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Hewan extends MahlukHidup 
{
    public Hewan(String name) {
        super(name);
    }

    public abstract void move();
}
