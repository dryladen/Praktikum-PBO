package Pertemuan1;

public class Hewan {
    private String nama, jenis, warna;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Hewan(String nama, String jenis, String warna) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
    }

}
