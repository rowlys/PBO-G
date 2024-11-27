
/**
 * Write a description of class TumbuhanTidakBerbunga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class TumbuhanTidakBerbunga extends Tumbuhan {
    public TumbuhanTidakBerbunga(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is growing by without producing flowers.");
    }

    @Override
    public void photosynthesize() {
        System.out.println(getName() + " is photosynthesizing without flowers.");
    }

}
