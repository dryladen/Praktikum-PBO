package Pertemuan5;

public abstract class Manusia {
    protected String nama, jenisKelamin, alamat;
    protected final int jumlahJantung = 1;
    int panjang,lebar;
    // abstract method
    public abstract void bernapas();

    public Manusia(String nama, String jenisKelamin, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
