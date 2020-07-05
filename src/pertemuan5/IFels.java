/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
        
public class IFels {
    public static void main(String[] args) {
        
        String sapa = JOptionPane.showInputDialog( null,"Assalamualaikum");
        String nama = JOptionPane.showInputDialog( null, "Nama Siapa Pak");
        String bicara = JOptionPane.showInputDialog( null,"Mau Kemana Pak");
        int suhu  = Integer.parseInt(JOptionPane.showInputDialog( null,"Cek Suhu Dulu"));
        
        
       if(suhu <=37){
           JOptionPane.showMessageDialog(null,"Ternyata" + nama+"Anda Negatif");
       }else{
            JOptionPane.showMessageDialog(null,"Ternyata " + nama + ",Anda Positif");
                   
           
       }
        
                
        
    }
    
}
