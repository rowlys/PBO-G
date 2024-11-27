/**
 * Write a description of class Burung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Anjing extends Hewan {
    public Anjing(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is growing by eating and exercising.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running on four legs.");
    }
}
