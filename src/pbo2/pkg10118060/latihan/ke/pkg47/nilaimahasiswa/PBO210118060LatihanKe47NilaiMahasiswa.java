/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg47.nilaimahasiswa;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menampikna nilai akhir dari beberapa
 * variabel dalam sebuah program
 */
public class PBO210118060LatihanKe47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiAkhir na1,na2,na3;
        
        na1 = new NilaiAkhir(75, 45, 34);
        na1.tampilNilai();
        na2 = new NilaiAkhir(60, 80, 75);
        na2.tampilNilai();
        na3 = new NilaiAkhir(30, 80, 40);
        na3.tampilNilai();
    }
    
}
