/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemian4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class contohBufferedReader {
    public static void main(String[] args)
            throws IOException {
       
        
       InputStreamReader isr = new InputStreamReader(System.in);
       //objek buffered
       BufferedReader br = new BufferedReader(isr);
       
       String nama ;
       String status ;
       String alamat ;
       int umur ;
       int tinggi ;
       double nilai;
       double ipk ;
               
        System.out.println("=======");
       
        System.out.println("Siapa Nama Mas      :");
        nama = br.readLine();
        
        System.out.println("Udah Punya Pasangan :");
        status = br.readLine();
        
        System.out.println("Alamat Mas          :");
        alamat = br.readLine();
        
        System.out.println("Umur Anda Berapa Ya :");
        umur = Integer.parseInt(br.readLine());
       
        System.out.println("Tinggi Mas          :");
        tinggi = Integer.parseInt(br.readLine());
        
        System.out.println("Nilai Rata Rata Mas :");
        nilai = Double.parseDouble(br.readLine());
        
        System.out.println("Ipk Anda Mas        :");
        ipk = Double.parseDouble(br.readLine());
        
       //menampilkan nama
        System.out.println("=========");
        System.out.println("Nama Anda Adalah     :" + nama);
        System.out.println("Status Anda          :" + status);
        System.out.println("Alamat Anda          :" + alamat);
        System.out.println("Ternyata Umur Anda   : "+umur);
        System.out.println("Ternyata Tinggi Anda :" + tinggi);
        System.out.println("Nilai Rata Rata Anada:" + nilai);
        System.out.println("Ipk Anda             :" +ipk);
        
        
        
       
      
       
       
      
    }
}
