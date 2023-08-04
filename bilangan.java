/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author Madon
 */

import javax.swing.JOptionPane;

public class bilangan {
        
    public static void main(String[] args) {
        String inpat = JOptionPane.showInputDialog("masukkan angka : ");
        int input = Integer.parseInt(inpat);
        
        if (input >= 1 && input <= 50){
            if (input % 2 != 0 && input % 3 == 0){
                System.out.println(input+" merupakan bilangan ganjil dan kelipatan 3");
            }else if (input % 2 == 0){
                System.out.println(input +" merupakan bilangan genap");
            }else{
                System.out.println(input+" bukan bilangan ganjil yang kelipatannya 3");
            }
        } else {
            System.out.println("Masukkan angka 1 sampai 50 saja");
        }
    }
}
