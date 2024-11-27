
/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Doctor extends Manusia 
{
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes through lungs.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is gaining experience through practice.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is consulting patients.");
    }
}
