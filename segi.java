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
import java.util.Locale;
  
class segi  {
  public static void main(String args[]){
           
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("##  Program Java Menghitung Luas Segitiga  ##");
    System.out.println("=============================================");
    System.out.println();
     
    double a,t, luas;
 
    System.out.print("Input alas segitiga: ");
    a = input.nextDouble();
      
    System.out.print("Input tinggi segitiga: ");
    t = input.nextDouble();
  
    luas = 0.5 * a * t;
      
    System.out.println("Luas segitiga: "+luas);
 
  }
}
    
    

