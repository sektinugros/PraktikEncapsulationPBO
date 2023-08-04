/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

class warung {
  public static void main(String args[]){
    
    char nilai;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input Nilai Anda (A - E): ");
    nilai = input.next().charAt(0);
    
    switch (nilai) {
      case 'A':
        System.out.println("Pertahankan!");
        break;
      case 'B':
        System.out.println("Harus lebih baik lagi");
        break;
      case 'C':
        System.out.println("Perbanyak belajar");
        break;
      case 'D':
        System.out.println("Jangan keseringan main");
        break;
      case 'E':
        System.out.println("Kebanyakan bolos...");
        break;
      default:
        System.out.println("Maaf, format nilai tidak sesuai");
    }
  
  }
}