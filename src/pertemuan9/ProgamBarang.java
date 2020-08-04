/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import com.sun.org.apache.xpath.internal.operations.Equals;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ProgamBarang {
    public static void main(String[] args) {
        String barang[] = new String[5];
        for(int i=0; i<barang.length; i++){
       barang [i]= JOptionPane.showInputDialog(null, "input barang ke " +i);
            System.out.println(barang[i]);
            
            //rayysatudimensi
            
        }
        String cariBarang = JOptionPane.showInputDialog(null,"Cari Barang");
        for(int i=0; i<barang.length;i++){
            if(barang[i].equals(cariBarang)){
     JOptionPane.showMessageDialog(null,"Barang Yang Anda Cari Adalah " + cariBarang +"Ketemu Pada nomer ke" + i);
        
        }
        }
    }
    
}
