package Pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Mobil> dataMobil = new ArrayList<>();

        while (true) {
            System.out.println("====== Menu ======");
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
                    System.out.println("Create");
                    System.out.print("Input Pemilik : ");
                    String nama = input.readLine();
                    System.out.print("Input Merk : ");
                    String merk = input.readLine();
                    System.out.print("Input Plat : ");
                    String plat = input.readLine();
                    System.out.print("Input CC : ");
                    int cc = Integer.parseInt(input.readLine());
                    // Mobil mobil = new Mobil(nama, merk, plat, cc);
                    Mobil dataBaru = new Mobil(merk, nama, plat, cc);
                    dataMobil.add(dataBaru);
                    break;
                case 2:
                    System.out.println("Read");
                    for (int i = 0; i < dataMobil.size(); i += 1) {
                        System.out.println("Mobil ke-" + (i + 1));
                        dataMobil.get(i).display();
                    }
                    // Cara Lain pakai foreach
                    // for (Mobil mobil : dataMobil) {
                    // mobil.display();
                    // }
                    break;
                case 3:
                    System.out.println("Update");
                    System.out.println("Input Plat Mobil : ");
                    String nomor = input.readLine();
                    for (Mobil mobil : dataMobil) {
                        if (mobil.plat.equals(nomor)) {
                            System.out.print("Input Pemilik : ");
                            mobil.setPemilik(input.readLine());
                            System.out.print("Input Merk : ");
                            mobil.setMerk(input.readLine());
                            System.out.print("Input Plat : ");
                            mobil.setPlat(input.readLine());
                            System.out.print("Input CC : ");
                            mobil.setCc(Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Delete");
                    System.out.print("Input plat mobil : ");
                    String noPlat = input.readLine();
                    for (int i = 0; i < dataMobil.size(); i++) {
                        if (dataMobil.get(i).plat.equals(noPlat)) {
                            dataMobil.remove(i);
                            break;
                        }
                    }
                    // Nizzzzar : 059
                    // System.out.println("Mobil ke- : ");
                    // int nomor1 = Integer.parseInt(input.readLine());
                    // nomor1 -= 1;
                    // if (dataMobil.size() > nomor1) {
                    // dataMobil.remove(nomor1);
                    // }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }

    }
}
