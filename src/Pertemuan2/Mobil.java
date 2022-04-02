/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author Laden
 */
public class Mobil {
    String merk, pemilik, plat;
    int cc;

    public Mobil(String merk, String pemilik, String plat, int cc) {
        this.merk = merk;
        this.pemilik = pemilik;
        this.plat = plat;
        this.cc = cc;
    }

    void display() {
        System.out.println("Merk    : " + this.merk);
        System.out.println("Pemilik : " + this.pemilik);
        System.out.println("Plat    : " + this.plat);
        System.out.println("CC      : " + this.cc);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    void berjalan() {
        System.out.println("sedang berjalan");
    }

    void stop() {
        System.out.println("bisa berhenti");
    }

}
