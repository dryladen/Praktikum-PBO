/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author Laden
 */
public class Mobil {
    private String merk, pemilik, plat;
    private int cc;

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

    void berjalan() {
        System.out.println("sedang berjalan");
    }

    void stop() {
        System.out.println("bisa berhenti");
    }

    public void SetMerk(String merk) {
        // System.out.println("Merk : ");
        this.merk = merk;
    }

    public void SetPemilik(String pemilik) {
        // System.out.println("Pemilik : ");
        this.pemilik = pemilik;
    }

    public void SetPlat(String plat) {
        // System.out.println("Plat : ");
        this.plat = plat;
    }

    public void SetCC(int cc) {
        // System.out.println("CC : ");
        this.cc = cc;
    }

    public String getMerk() {
        // System.out.println(this.merk);
        return merk;
    }

    public String getPemilik() {
        // System.out.println(this.pemilik);
        return pemilik;
    }

    public String getPlat() {
        // System.out.println(this.plat);
        return plat;
    }

    public int getCC() {
        // System.out.println(this.cc);
        return cc;
    }

}
