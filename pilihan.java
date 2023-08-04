/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class pilihan{
private static final BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

public static void main (String [] args) throws Exception{
    
double vol, phi=3.14;

System.out.println(" Penghitung Volume ");
System.out.println("==============================");
System.out.println(" 1. Kubus ");
System.out.println(" 2. Balok ");
System.out.println(" 3. Tabung");
System.out.println(" 4. Keluar");
System.out.println("==============================");
System.out.print   (" Masukkan Pilihan : ");

String input = stdin.readLine();
int pil = Integer.parseInt(input);
System.out.println();


switch (pil){
    
case 1 -> {
    System.out.print("Masukan Panjang Sisi : ");
    String sisi = stdin.readLine();
    int s = Integer.parseInt(sisi);
    System.out.println ();
    vol=s*s*s;
    System.out.println ("Volume Kubus ini adalah "+vol);
        }

case 2 -> {
    System.out.print("Masukan Panjang : ");
    String panjang = stdin.readLine();
    int p = Integer.parseInt(panjang);
    System.out.print("Masukan Lebar : ");
    String lebar = stdin.readLine();
    int l = Integer.parseInt(lebar);
    System.out.print("Masukan Tinggi : ");
    String tinggi = stdin.readLine();
    int t = Integer.parseInt(tinggi);
    System.out.println ();
    vol=p*l*t;
    System.out.println ("Volume Balok ini adalah "+vol);
        }

case 3 -> {
    System.out.print("Masukan Tinggi : ");
    String tinggi2 = stdin.readLine();
    int tb = Integer.parseInt(tinggi2);
    System.out.print("Masukan Jari-jari : ");
    String jari2 = stdin.readLine();
    int r = Integer.parseInt(jari2);
    System.out.println ();
    vol=phi*r*r*tb;
    System.out.println ("Volume Tabung ini adalah "+vol);
        }

case 4 -> {
    System.out.print("Masukan Tinggi : ");
    String tinggi3 = stdin.readLine();
    int tk = Integer.parseInt(tinggi3);
    System.out.print("Masukan Jari-jari : ");
    String jari2x = stdin.readLine();
    int rk = Integer.parseInt(jari2x);
    System.out.println ();
    vol=phi/3*rk*rk*tk;
    System.out.println ("Volume Kerucut ini adalah "+vol);
        }

case 5 -> {
        }
default -> System.out.println ("Pilihan tak ada dalam daftar");
}
}
}
