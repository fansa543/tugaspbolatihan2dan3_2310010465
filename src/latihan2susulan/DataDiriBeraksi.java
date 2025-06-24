/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2susulan;

/**
 *
 * @author LENOVO
 */
public class DataDiriBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Biodata dengan nama objek: fadil
        Biodata fadil = new Biodata("Al-Fadilah Nur Sahdan Al-Biya", "2310010465", "Informatika", 2023);
        
        // Menampilkan isi data menggunakan method tampilkanBiodata
        fadil.tampilkanBiodata();
    }
}
