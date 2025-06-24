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
public class BangunDatarBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class BangunDatar dengan nama objek: fadil
        BangunDatar fadil = new BangunDatar();

        // Mengisi nilai alas, tinggi, dan jarijari
        fadil.alas = 10;
        fadil.tinggi = 5;
        fadil.jarijari = 7;

        // Menghitung dan menampilkan luas segitiga
        fadil.hitungLuasSegitiga();
        System.out.println("Nilai hasil (luas segitiga): " + fadil.getHasil());

        // Menghitung dan menampilkan luas lingkaran
        fadil.hitungLuasLingkaran();
        System.out.println("Nilai hasil (luas lingkaran): " + fadil.getHasil());
    }
}
