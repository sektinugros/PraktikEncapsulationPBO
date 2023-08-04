/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

import javax.swing.JOptionPane;
public class MenuPilihan {
    
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil = 0;
        
        String input = JOptionPane.showInputDialog("MAsukkan Pilihan Anda");
        int pilihan = Integer.parseInt(input);
  
        switch (pilihan) {
            case 1 :
                hasil = a + b ;
                System.out.println("penjumlahan " +  a + "dan" + b + " adalah "+ hasil );
                break;
            case 2 :
                hasil = a - b ;
                System.out.println("pengurangan " +  a + "dan" + b + " adalah "+ hasil );
                break;
            default:
                System.out.println("Anda salah Pilih");  
        }
    }
}
