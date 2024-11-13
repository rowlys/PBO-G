
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App {
    public static void main(String[] args) {
        Rental rental = new Rental();

        // Menambahkan kendaraan
        rental.tambahKendaraan(new Mobil("Toyota", "Avanza", 2020, 4));
        rental.tambahKendaraan(new Motor("Honda", "CBR", 2019, 2));
        rental.tambahKendaraan(new Sepeda("Polygon", "BMX", 2021, "BMX"));

        // Menambahkan penyewa
        Penyewa penyewa1 = new Penyewa("Andi", new Mobil("Toyota", "Avanza", 2020, 4));
        Penyewa penyewa2 = new Penyewa("Budi", new Sepeda("Polygon", "BMX", 2021, "BMX"));
        
        rental.tambahPenyewa(penyewa1);
        rental.tambahPenyewa(penyewa2);

        // Menampilkan kendaraan yang tersedia
        rental.tampilkanKendaraanTersedia();

        // Menampilkan daftar penyewa
        rental.tampilkanPenyewa();
    }
}

