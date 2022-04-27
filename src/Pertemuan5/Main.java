package Pertemuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        ArrayList<Dosen> dataDosen = new ArrayList<>();
        int pilihan;
        String nama;
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
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama : ");
                        nama = input.readLine();
                        System.out.println("Masukan jenis kelamin : ");
                        String jenisKelamin = input.readLine();
                        System.out.println("Masukan alamat : ");
                        String alamat = input.readLine();
                        System.out.println("Masukan nim : ");
                        String nim = input.readLine();
                        dataMahasiswa.add(new Mahasiswa(nama, jenisKelamin, alamat, nim));
                    } else {
                        System.out.println("Masukan nama : ");
                        nama = input.readLine();
                        System.out.println("Masukan nip : ");
                        String nip = input.readLine();
                        System.out.println("Masukan jenis kelamin : ");
                        String jenisKelamin = input.readLine();
                        System.out.println("Masukan alamat : ");
                        String alamat = input.readLine();
                        dataDosen.add(new Dosen(nama, nip, jenisKelamin, alamat));
                    }
                    break;
                case 2:
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        for (int i = 0; i < dataMahasiswa.size(); i++) {
                            System.out.println("Mahasiswa ke - " + (i + 1));
                            dataMahasiswa.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < dataDosen.size(); i++) {
                            System.out.println("Dosen ke - " + (i + 1));
                            dataDosen.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama mahasiswa : ");
                        nama = input.readLine();
                        for (Mahasiswa i : dataMahasiswa) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan jenis kelamin baru : ");
                                i.setJenisKelamin(input.readLine());
                                System.out.println("Masukan alamat baru : ");
                                i.setAlamat(input.readLine());
                                System.out.println("Masukan nim baru : ");
                                i.setNim(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan nama Dosen : ");
                        nama = input.readLine();
                        for (Dosen i : dataDosen) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan jenis kelamin baru : ");
                                i.setJenisKelamin(input.readLine());
                                System.out.println("Masukan alamat baru : ");
                                i.setAlamat(input.readLine());
                                System.out.println("Masukan nim baru : ");
                                i.setNip(input.readLine());
                            }
                        }
                    }
                    break;
                case 4:
                    // Vauwez 054
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama mahasiswa : ");
                        nama = input.readLine();
                        for (Mahasiswa i : dataMahasiswa) {
                            if (i.getNama().equals(nama)) {
                                dataMahasiswa.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Masukan nama dosen : ");
                        nama = input.readLine();
                        for (Dosen i : dataDosen) {
                            if (i.getNama().equals(nama)) {
                                dataDosen.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}
