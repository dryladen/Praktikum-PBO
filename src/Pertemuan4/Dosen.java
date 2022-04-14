package Pertemuan4;

public class Dosen extends Manusia {
    private String nip;

    // Constructor
    public Dosen(String nama, String nip, String jenisKelamin, String alamat) {
        super(nama, jenisKelamin, alamat);
        this.nip = nip;
    }

    // Setter & Getter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("NIP           : " + this.nip);
    }
}
