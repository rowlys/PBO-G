
/**
 * Write a description of class MahlukHidup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class MahlukHidup
{
    
    private String name;

    public MahlukHidup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void breathe();

    public abstract void grow();

}
