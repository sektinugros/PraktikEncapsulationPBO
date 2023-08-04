package w04_encapsulation;
import java.util.Scanner; 

public class volume {
   
    public static void main(String[] args) {
    double sisi, panjang, lebar, tinggi, jari;
 
        Scanner input = new Scanner( System.in);
    
        System.out.println(" Masukkan pilihan perhitungan anda :");
        System.out.println("=========================");
        System.out.println("1. Perhitungan Volume Kubus");
        System.out.println("2. Perhitungan Volume Balok");
        System.out.println("3. Perhitungan Volume Tabung");
        System.out.println("=========================");
        System.out.print ("masukkan pilihan:");
        
       String pilihan = input.nextLine();
        
switch (pilihan) {
    case "1":
    System.out.print ("Masukkan nilai Sisi Sisi Kubus : ");
    sisi = input.nextDouble();
    double hasil = sisi * sisi * sisi;
    System.out.println("Hasil dari Perhitungan Volume Kubus adalah : " + hasil);
                                
break;
case "2":
System.out.print ("Masukkan nilai Panjang Balok : ");
panjang = input.nextDouble();
System.out.print ("Masukkan nilai Lebar Balok : ");
lebar = input.nextDouble();
System.out.print ("Masukkan nilai Tinggi Balok : ");
tinggi = input.nextDouble();
hasil = panjang * lebar * tinggi;
System.out.println("Hasil dari Perhitungan Volume Balok adalah : " + hasil);
                                
break;
case "3":
System.out.print ("Masukkan nilai Jari -jari Tabung : ");
jari = input.nextDouble();
System.out.print ("Masukkan nilai Tinggi Tabung : ");
tinggi = input.nextDouble();
hasil = 3.14  * jari * jari * tinggi;
System.out.println("hasil dari Perhitungan Volume Tabung adalah :  " + hasil +"cm3");
                                
break;
default:
System.out.println("maaf anda salah memasukkan pilihan !");            
         }
    }
}
