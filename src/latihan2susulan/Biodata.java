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
public class Biodata {
    String namaLengkap;
    String npm;
    String programStudi;
    int angkatan;

    // Constructor
    public Biodata(String namaLengkap, String npm, String programStudi, int angkatan) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    // Optional: Method untuk menampilkan biodata
    public void tampilkanBiodata() {
        System.out.println("Nama Lengkap  : " + namaLengkap);
        System.out.println("NPM           : " + npm);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Angkatan      : " + angkatan);
    }
}
