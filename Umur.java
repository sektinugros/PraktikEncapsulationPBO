/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

import javax.swing.JOptionPane;
public class Umur {
    public static void main(String[] args) {
        String kategori;
        String input = JOptionPane.showInputDialog(" Masukkan Umur : ");
        int umur = Integer.parseInt(input);
                

        if (umur < 5){
            kategori = "Balita";
        } else if (umur < 12){
            kategori = "Anak";
        } else if (umur < 18){
            kategori = "Remaja";
        } else if (umur < 40){
            kategori = "Dewasa";
        } else if (umur < 60){
            kategori = "Paruhbaya";
        } else if (umur > 60){
            kategori = "Lanjut Usia";
        } else {
            kategori = "Error";
        }
        System.out.println("Anda Termasuk Kategori " + kategori);
    }
}
