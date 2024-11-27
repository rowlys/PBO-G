
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Manusia programmer = new Programmer("Raven");
        Manusia doctor = new Doctor("Louisa");
        
        Hewan anjing = new Anjing("Boltund");
        Hewan burung = new Burung("Pidgey");
        
        Tumbuhan bunga = new TumbuhanBerbunga("Melati");
        Tumbuhan tanpaBunga = new TumbuhanTidakBerbunga("Kuping Gajah");
        
        programmer.breathe();
        programmer.grow();
        programmer.speak();
        
        System.out.println();
        doctor.breathe();
        doctor.grow();
        doctor.speak();

        System.out.println();
        anjing.breathe();
        anjing.grow();
        anjing.move();
        
        System.out.println();
        burung.breathe();
        burung.grow();
        burung.move();
        
        System.out.println();
        bunga.breathe();
        bunga.grow();
        bunga.photosynthesize();
        
        System.out.println();
        tanpaBunga.breathe();
        tanpaBunga.grow();
        tanpaBunga.photosynthesize();
    }
}
