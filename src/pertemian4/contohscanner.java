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
import java.util.Scanner;
public class contohscanner {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        String alamat;
        String status;
        int umur;
        int tinggi;
        Double  nilai;
        Double ipk;
        Scanner input = new Scanner(System.in);
        //
        System.out.println("==========");
        System.out.print("Nama : ");
        nama = input.next();
        System.out.print("Status :");
        status = input.next();
        System.out.print("Alamat : ");
        alamat = input.next();
        System.out.print("Umur   :");
        umur = input.nextInt();
        System.out.print("Tinggi :");
        tinggi = input.nextInt();
        System.out.print("Nilai  :");
        nilai = input.nextDouble();
        System.out.print("Ipk    :");
        ipk = input.nextDouble();
        //
        System.out.println("=========");
        System.out.println("Nama Siapa      : " + nama);
        System.out.println("Alamat Dimana   : " + alamat);
        System.out.println("Umur Berapa     :"  + umur);
        System.out.println("Tinggi Ada      :" + tinggi );
        System.out.println("Nilai Rata Rata : "+ nilai);
        System.out.println("Ipk Anda        :"  +ipk);
        
      
        
        
        
        
    }
    
}
