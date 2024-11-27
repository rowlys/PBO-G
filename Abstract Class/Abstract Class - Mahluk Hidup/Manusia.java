
/**
 * Write a description of class Manusia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Manusia extends MahlukHidup
{
    public Manusia(String name) {
        super(name);
    }

    public abstract void speak();
}
