/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3susulan;

/**
 *
 * @author LENOVO
 */
public class BangunDatar {
    // Nama  : Al-Fadilah Nur Sahdan Al-Biya
// NPM   : 2310010465
// Kelas : I4C
     double alas;
    double tinggi;
    double jarijari;
    double hasil;
    
    // Method untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil);
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jarijari * jarijari;
        System.out.println("Luas Lingkaran = " + hasil);
    }

    // Accessor: Mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }
}
