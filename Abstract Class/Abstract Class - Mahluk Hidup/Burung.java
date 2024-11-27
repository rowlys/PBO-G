/**
 * Write a description of class Burung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Burung extends Hewan {
    public Burung(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is growing by eating seeds.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying in the sky.");
    }
}
