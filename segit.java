package w04_encapsulation;
import javax.swing.JOptionPane;

public class segit {
    public static void main(String[] args) {
        String[] pilihan = {"Kubus", "Balok", "Tabung"};
        String bentuk = (String) JOptionPane.showInputDialog(
                null,
                "Masukkan pilihan perhitungan anda :",
                "Pilih Bentuk",
                JOptionPane.PLAIN_MESSAGE,
                null,
                pilihan,pilihan[0]);

        switch (bentuk) {
            case "Kubus" -> {
                double sisi = Double.parseDouble(JOptionPane.showInputDialog
        (null, "MMasukkan nilai Sisi Sisi Kubus :"));
                double hasil = sisi * sisi * sisi;
                JOptionPane.showMessageDialog
        (null, "Hasil dari Perhitungan Volume Kubus adalah : " + hasil);
            }
            
            case "Balok" -> {
                double panjang = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Masukkan nilai Panjang Balok : ")); 
                double lebar = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Masukkan nilai Lebar Balok : "));
                double tinggi = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Masukkan nilai Tinggi Balok : "));
                double hasil = panjang * lebar * tinggi;
                JOptionPane.showMessageDialog
        (null, "Hasil dari Perhitungan Volume Balok adalah : " + hasil);
            }
            
            case "Tabung" -> {
                double jari = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Masukkan Nilai Jari -jari Tabung : "));
                double tinggi= Double.parseDouble(JOptionPane.showInputDialog
        (null, "Masukkan Nilai Tinggi Tabung:"));
                double hasil = 3.14 * jari * jari * tinggi; 
                JOptionPane.showMessageDialog
        (null, "Hasil dari Perhitungan Volume tabung adalah: " + hasil);
            }

            default -> JOptionPane.showMessageDialog
        (null, "Maaf Ada Kesalahan !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
