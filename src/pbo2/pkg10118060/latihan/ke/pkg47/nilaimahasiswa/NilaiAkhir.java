/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg47.nilaimahasiswa;

/**
 *
 * @author Synxsaints
 */
public class NilaiAkhir {
    private double quiz;
    private double uts;
    private double uas;
    private double nilaiAkhir;
    
    public NilaiAkhir(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uas = uas;
        this.uts = uts;
    }
    
    public double hitungNilaiAkhir (){
        return (0.2*quiz)+(0.3*uts)+(0.5*uas);
    }
    
    public String getIndex(double nilaiAkhir){
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) return "A";
        else if (nilaiAkhir >= 68 && nilaiAkhir < 80) return "B";
        else if (nilaiAkhir >= 56 && nilaiAkhir < 68) return "C";
        else if (nilaiAkhir >= 45 && nilaiAkhir < 56) return "D";
        else return "E";
    }
    
    public String Keterangan(String index){
        String keterangan;
        switch(index){
            case "A": keterangan = "Sangat Baik"; break;
            case "B": keterangan = "Baik"; break;
            case "C": keterangan = "Cukup"; break;
            case "D": keterangan = "Kurang"; break;
            default: keterangan = "Sangat Kurang"; break;
        }
        return keterangan;
    }
    
    public void tampilNilai(){
        
        nilaiAkhir = hitungNilaiAkhir();
        
        System.out.println("QUIZ            = " + quiz);
        System.out.println("UTS             = " + uts);
        System.out.println("UAS             = " + uas);
        
        System.out.println("Nilai Akhir     = " + nilaiAkhir);
        
        System.out.println("Index = " + getIndex(nilaiAkhir));
        System.out.println("Keterangan = " + Keterangan(getIndex(nilaiAkhir)));
        System.out.println();
        
    }
    
}
