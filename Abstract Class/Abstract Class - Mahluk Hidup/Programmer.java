
/**
 * Write a description of class Programmer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Programmer extends Manusia 
{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes through lungs.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is learning new programming languages.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is explaining coding concepts.");
    }
}
