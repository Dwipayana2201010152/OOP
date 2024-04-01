/*
Nama    :
NIM     :
Project :
 */
package sayhello;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class SayHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,alamat;
        int tahun, umur;
             
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukkan Alamat Anda : ");
        alamat = keyboard.nextLine();        
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        tahun = keyboard.nextInt();
          
        umur = 2024 - tahun;
        System.out.println("");
        System.out.println("Hallo " + nama + " Apa Kabar??");
        System.out.println("Anda Tinggal Di " + alamat);
        System.out.println("Anda Sekarang Ber Umur " + umur + " Tahun");
    }
    
}
