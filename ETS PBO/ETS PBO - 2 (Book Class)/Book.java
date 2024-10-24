/**
 * ETS PBO G - Nomor 2
 *
 * @author Basten Andika Salim - 5025231132
 *
 */
public class Book
{
    private String judul, penulis, nama_penerbit, kategori_buku;
    private int tahun_terbit;
    
    public Book(String judul, String penulis, String nama_penerbit, String kategori_buku, int tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this.nama_penerbit = nama_penerbit;
        this.kategori_buku = kategori_buku;
        this.tahun_terbit = tahun_terbit;
    }
    
    public void printDetails(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun terbit: " + tahun_terbit);
        System.out.println("Nama penerbit: " +  nama_penerbit);
        System.out.println("Kategori buku: " + kategori_buku);
    }
}
