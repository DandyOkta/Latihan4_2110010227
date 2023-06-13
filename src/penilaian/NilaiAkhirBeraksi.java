/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author acer
 */
public class NilaiAkhirBeraksi {
    public static void main(String[] args) {
        NilaiAkhir dandy = new NilaiAkhir(80,70,80, "Muhammad Dandy Oktavian Nisfi", "2110010227");
        
        System.out.println("Nama : "+dandy.nama);
        System.out.println("NPM  : "+dandy.npm);
        System.out.println("Nilai Akhir : "+dandy.hitungNilaiAkhir());
    }
}
