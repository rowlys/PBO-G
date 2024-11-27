
/**
 * Write a description of class TumbuhanBerbunga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class TumbuhanBerbunga extends Tumbuhan {
    public TumbuhanBerbunga(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is growing by producing flowers.");
    }

    @Override
    public void photosynthesize() {
        System.out.println(getName() + " is producing food through photosynthesis.");
    }

}
