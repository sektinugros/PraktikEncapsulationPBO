/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

import javax.swing.JOptionPane;

public class hipertensi {
 
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("masukkan tekanan darah anda");
        int tekanan_darah = Integer.parseInt(input);
        
        if(tekanan_darah>140){
            System.out.println("anda terkena Hipertensi");
        }   
    }
}
