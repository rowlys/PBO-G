
/**
 * Write a description of class Tumbuhan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Tumbuhan extends MahlukHidup 
{
    public Tumbuhan(String name) {
        super(name);
    }

    public abstract void photosynthesize();
}
