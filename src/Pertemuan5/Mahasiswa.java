package Pertemuan5;

public class Mahasiswa extends Manusia {
    private String nim;

    public Mahasiswa(String nama, String jenisKelamin, String alamat, String nim) {
        super(nama, jenisKelamin, alamat);
        this.nim = nim;
        this.nim = "hal0";
    }

    final public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("NIM           : " + this.nim);
        this.bernapas();
    }

    @Override
    public void bernapas() {
        System.out.println("Mahasiswa : "+this.nama+ " bernapas dengan lubang hidung kanan");
    }
}
