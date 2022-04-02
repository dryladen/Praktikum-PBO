/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.*;
// import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Laden
 */
public class Pertemuan_1 {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // create scanner object [jenis input pertama]
        // Scanner input = new Scanner(System.in);

        // create bufferedreader object
        InputStreamReader input2 = new InputStreamReader(System.in);
        BufferedReader input3 = new BufferedReader(input2);

        // create Arraylist object
        ArrayList<String> list = new ArrayList<>();

        // input data dengan bufferreader
        System.out.print("Masukkan jumlah data : ");
        int jumlah = Integer.parseInt(input3.readLine());
        // memasukan data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + " : ");
            list.add(input3.readLine());
        }
        // output data
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Data ke-" + (i + 1) + " : " + list.get(i));
        }

        // System.out.print("Masukkan Nama : ");
        // String nama = input3.readLine();
        // System.out.print("Masukkan NIM : ");
        // int nim = Integer.parseInt(input3.readLine());
        // System.out.print("Masukkan IPK : ");
        // float ipk = Float.parseFloat(input3.readLine());

        // output data
        // System.out.println("Nama : " + nama);
        // System.out.println("NIM : " + nim);
        // System.out.println("IPK : " + ipk);

        // input data dengan scanner
        // System.out.print("Masukan Nama : ");
        // String nama = input.nextLine();
        // System.out.print("Masukan NIM : ");
        // int nim = input.nextInt();
        // System.out.print("Masukkan IPK : ");
        // float ipk = input.nextFloat();

        // input.close();
    }

}
