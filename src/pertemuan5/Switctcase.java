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
import java.util.Scanner;
public class Switctcase {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         System.out.println("Suhu anda");
         int suhu = input.nextInt();
         
         //percabangan
         
         switch (suhu){
             case 20 :
                 System.out.println(" Anda Negatif");
                 break;
             case 25 :
                 System.out.println(" Anda Negatif");
                 break;
             case 30:
                 System.out.println("Anda ODP");
                 break;
             case 35:
                 System.out.println("Anda Positif");
                 break;
             case 40:
                 System.out.println("Anda Positif");
                 break;
                 
                 default:
                     System.out.println("Suhu yang anda masukkan salah");
         }
    }
}
