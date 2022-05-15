package Pertemuan6;

import java.io.IOException;
import java.util.ArrayList;

public class Dosen extends Account implements UserLevelB, UserLevelC {
    private ArrayList<Kelas> kelas;
    private String nip;

    // Constructor
    public Dosen(String username, String password, String nama, String jenisKelamin, String alamat, String nip) {
        super(username, password, nama, jenisKelamin, alamat);
        this.nip = nip;
        kelas = new ArrayList<>();
    }

    // Setter & Getter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public ArrayList<Kelas> getKelas() {
        return kelas;
    }

    public void setKelas(ArrayList<Kelas> kelas) {
        this.kelas = kelas;
    }

    @Override
    public void profile() {
        System.out.println("=========================================================");
        super.profile();
        System.out.println("NIP           : " + this.nip);
        System.out.println("=========================================================");
    }

    @Override
    public void joinKelas() {
        try {
            Kelas.displayKelas();
            System.out.println("Masukan kode kelas : ");
            String kodeKelas = input.readLine();
            for (Kelas k : Kelas.getKelas()) {
                if (k.getKode().equals(kodeKelas) && !k.getDosen().equals(this.nama)) {
                    kelas.add(k);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void buatKelas() {
        try {
            System.out.println("Masukan nama kelas : ");
            String namaKelas = input.readLine();
            System.out.println("Masukan kode kelas : ");
            String kodeKelas = input.readLine();
            this.kelas.add(new Kelas(namaKelas, kodeKelas, this.nama));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void hapusKelas() {
        try {
            if (this.kelas.isEmpty()) {
                System.out.println("Kelas kosong");
            } else {
                System.out.println("Masukan kode kelas : ");
                String kodeKelas;
                kodeKelas = input.readLine();
                for (int i = 0; i < this.kelas.size(); i++) {
                    if (this.kelas.get(i).getNama().equals(kodeKelas)) {
                        this.kelas.remove(i);
                        System.out.println("Kelas berhasil dihapus");
                        return;
                    }
                }
                System.out.println("Kelas tidak ditemukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void lihatKelas() {
        if (this.kelas.isEmpty()) {
            System.out.println("Dosen : " + this.nama + " belum memiliki kelas");
        } else {
            System.out.println("===============================");
            System.out.println("Kelas yang dimiliki : ");
            System.out.println("===============================");
            for (Kelas kelas2 : this.kelas) {
                System.out.println("Kelas ke-" + kelas.indexOf(kelas2) + 1 + " : ");
                System.out.println("Nama Kelas : " + kelas2.getNama());
                System.out.println("Kode Kelas : " + kelas2.getKode());
                System.out.println("Dosen      : " + kelas2.getDosen());
                System.out.println("-------------------------------");
            }
        }
    }

    @Override
    public void ubahKelas() {
        try {
            if (this.kelas.isEmpty()) {
                System.out.println("Dosen : " + this.nama + " belum memiliki kelas");
            } else {
                System.out.println("Masukan nama kelas : ");
                String namaKelas;
                namaKelas = input.readLine();
                System.out.println("Masukan kode kelas : ");
                String kodeKelas = input.readLine();
                for (int i = 0; i < this.kelas.size(); i++) {
                    if (this.kelas.get(i).getNama().equals(namaKelas)) {
                        this.kelas.get(i).setNama(namaKelas);
                        this.kelas.get(i).setKode(kodeKelas);
                        System.out.println("Kelas berhasil diubah");
                        return;
                    }
                }
                System.out.println("Kelas tidak ditemukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void menu() {
        try {
            while (true) {
                Kelas.displayKelas();
                System.out.println("==========================");
                System.out.println("1. Lihat Kelas");
                System.out.println("2. Tambah Kelas");
                System.out.println("3. Hapus Kelas");
                System.out.println("4. Profile");
                System.out.println("5. Logout");
                System.out.println("==========================");
                System.out.println("Pilih menu: ");
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        this.lihatKelas();
                        break;
                    case 2:
                        this.buatKelas();
                        break;
                    case 3:
                        this.hapusKelas();
                        break;
                    case 4:
                        this.profile();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
