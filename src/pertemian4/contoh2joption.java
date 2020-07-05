/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemian4;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class contoh2joption {
    public static void main(String[] args) {
         String nama = JOptionPane.showInputDialog("Nama Anda");
         String alamat = JOptionPane.showInputDialog("Alamat Anda");
         String jenis = JOptionPane.showInputDialog("Jenis Barang Yang Dibeli");
         String merk = JOptionPane.showInputDialog("Merk Barang Yang Dibeli");
         String jumlah = JOptionPane.showInputDialog("Jumlah Barang yang Dibeli");
         
         
         int Jumlah = Integer.parseInt(jumlah);
         int harga  = 23000000;
         double total = Jumlah*harga;
         
         System.out.println("Nama Anda  :" + nama);
         System.out.println("Alamat yang DIkirim :" +alamat);
         System.out.println("Jenis Barang  :"+ jenis);
         System.out.println("Merk Barang  :"+ merk);
         System.out.println("Total yang Harus Dibayar :"+total);
         
         
         
                
                
        
    }
}
