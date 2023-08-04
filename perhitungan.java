/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

import javax.sound.midi.Soundbank;

/**
 *
 * @author LENOVO
 */
public class perhitungan {
    double sisiKiri, sisiKanan;

    public double getSisiKiri() {
        return sisiKiri;
    }

    public void setSisiKiri(double sisiKiri) {
        this.sisiKiri = sisiKiri;
    }

    public double getSisiKanan() {
        return sisiKanan;
    }

    public void setSisiKanan(double sisiKanan) {
        this.sisiKanan = sisiKanan;
    }
    
    
    public double hasilDariPerkalian (){
        double hasilPerkalian = sisiKiri*sisiKanan;
        return hasilPerkalian;      
        
    }
    
    public static void main(String[] args) {
        
        perhitungan hasil = new perhitungan();
        hasil.setSisiKanan(20);
        hasil.setSisiKiri(10);
                
        double hasilPerkalian = hasil.hasilDariPerkalian();
        System.out.println(hasil.getSisiKanan());
        System.out.println(hasil.getSisiKiri());
        System.out.println(hasilPerkalian);
      
    }
    
    
}
