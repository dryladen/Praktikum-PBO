package Pertemuan2;

/**
 *
 * @author Laden
 */
public class Mahasiswa {
    // property / attribut
    String nama,prodi;
    int nim;
    double ipk;
    // constructor
    public Mahasiswa(String namaParam, int nim, double ipk, String prodi){
        nama = namaParam;
        this.nim = nim;
        this.ipk = ipk;
        this.prodi = prodi;
    }
    // constructor overloading
    public Mahasiswa(){
    }
    
    // method
    public void belajar(){
        System.out.println(this.nama + " sedang berjalan");
    }
    
    public void makan(){
        System.out.println(this.nama + " sedang makan");
    }
    
        
}
