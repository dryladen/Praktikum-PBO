package Pertemuan6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Staff extends Account implements UserLevelA {
    private ArrayList<Dosen> dataDosen;
    private ArrayList<Mahasiswa> dataMahasiswa;
    private InputStreamReader prepare;
    private BufferedReader input;
    private int pilihan;

    public Staff(String username, String password, String nama, String jenisKelamin, String alamat,
            ArrayList<Dosen> dataDosen, ArrayList<Mahasiswa> dataMahasiswa) {
        super(username, password, nama, jenisKelamin, alamat);
        this.dataDosen = dataDosen;
        this.dataMahasiswa = dataMahasiswa;
        this.prepare = new InputStreamReader(System.in);
        this.input = new BufferedReader(prepare);
    }

    @Override
    public void showData() throws IOException {
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            for (int i = 0; i < dataMahasiswa.size(); i++) {
                System.out.println("Mahasiswa ke - " + (i + 1));
                dataMahasiswa.get(i).profile();
            }
        } else {
            for (int i = 0; i < dataDosen.size(); i++) {
                System.out.println("Dosen ke - " + (i + 1));
                dataDosen.get(i).profile();
            }
        }
    }

    @Override
    public void addData() throws IOException {
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama : ");
            String nama = input.readLine();
            System.out.print("Masukan jenis kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukan alamat : ");
            String alamat = input.readLine();
            System.out.print("Masukan nim : ");
            String nim = input.readLine();
            dataMahasiswa.add(new Mahasiswa(nim, "1234", nama, jenisKelamin, alamat,
                    nim));
        } else {
            System.out.print("Masukan nama : ");
            String nama = input.readLine();
            System.out.print("Masukan nip : ");
            String nip = input.readLine();
            System.out.print("Masukan jenis kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukan alamat : ");
            String alamat = input.readLine();
            dataDosen.add(new Dosen(nip, "1234", nama, nip, jenisKelamin, alamat));
        }
    }

    @Override
    public void updateData() throws IOException {
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama mahasiswa : ");
            String nama = input.readLine();
            for (Mahasiswa i : dataMahasiswa) {
                if (i.getNama().equals(nama)) {
                    System.out.print("Masukan nama baru : ");
                    i.setNama(input.readLine());
                    System.out.print("Masukan jenis kelamin baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("Masukan alamat baru : ");
                    i.setAlamat(input.readLine());
                    System.out.print("Masukan nim baru : ");
                    i.setNim(input.readLine());
                }
            }
        } else {
            System.out.print("Masukan nama Dosen : ");
            String nama = input.readLine();
            for (Dosen i : dataDosen) {
                if (i.getNama().equals(nama)) {
                    System.out.print("Masukan nama baru : ");
                    i.setNama(input.readLine());
                    System.out.print("Masukan jenis kelamin baru : ");
                    i.setJenisKelamin(input.readLine());
                    System.out.print("Masukan alamat baru : ");
                    i.setAlamat(input.readLine());
                    System.out.print("Masukan nim baru : ");
                    i.setNip(input.readLine());
                }
            }
        }
    }

    @Override
    public void deleteData() throws IOException {
        // Vauwez 054
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Masukan pilihan : ");
        pilihan = Integer.parseInt(input.readLine());
        if (pilihan == 1) {
            System.out.print("Masukan nama mahasiswa : ");
            String nama = input.readLine();
            for (Mahasiswa i : dataMahasiswa) {
                if (i.getNama().equals(nama)) {
                    dataMahasiswa.remove(i);
                }
            }
        } else {
            System.out.print("Masukan nama dosen : ");
            String nama = input.readLine();
            for (int i = 0; i < dataDosen.size(); i++) {
                if (dataDosen.get(i).getNama().equals(nama)) {
                    dataDosen.remove(i);
                }
            }
        }
    }

    @Override
    public void sortData() throws IOException {

    }

    @Override
    public void searchData() throws IOException {

    }

    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("====== Menu Manajemen data mahasiswa & dosen ======");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("==================");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    this.addData();
                    break;
                case 2:
                    this.showData();
                    break;
                case 3:
                    this.updateData();
                    break;
                case 4:
                    this.deleteData();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}