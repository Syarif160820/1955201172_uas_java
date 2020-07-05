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
public class ContohPerulanganDoWhile {
     public static void main(String[] args) {
         int n = 1;
        String Lantai = "" ;
    System.out.println("Mulai");
     System.out.println("Siapkan sapu");
     System.out.println("Cari lokasi yang di sapu");
        System.out.println("sapu lantai");

      
//      misalkan lantai sudah bersih
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
   
   do{
   
       System.out.println("sapu lantai lagi - "+i);
       i++;
   }
    while (i < 8);
     System.out.println("kembalikan sapu");
     System.out.println("selesai");  
    }
    
}
