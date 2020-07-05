/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */
public class ContohPerulanganWhile {
     public static void main(String[] args) {
        
            int n = 1;
                    
     String Lantai = "" ;
     System.out.println("Mulai");
     System.out.println("Siapkan sapu");
     System.out.println("Cari lokasi yang di sapu");
     System.out.println("sapu lantai");
                
        
        String lantai;  
    lantai = "bersih";
   System.out.println("apakah lantai sudah bersih");
   if("bersih".equals(lantai)){
   System.out.println("sudah bersih");
    }
   else {
   System.out.println("belum bersih");
}
   int i = 1;
   while (i<4){
       System.out.println("sapu lantai lagi - "+i);
       i++;
   }
        System.out.println("kembalikan sapu");
System.out.println("selesai");  
    
    }
    
}
