/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasibilangan;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class OperasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b1, b2, jml, min, kali, bagi;
        // b1= 28;
        // b2= 29;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter First Number ");
        b1= sc.nextFloat();
        
        System.out.print("Enter Second Number ");
        b2= sc.nextFloat();
        
        jml= b1 + b2;
        min= b2 - b1;
        kali= b1 * b2;
        bagi= b2 / b1;
        System.out.println("Hasil penjumlahan bilangan "+ b1 +" + "+ b2 +" = "+ jml);
        System.out.println("Hasil pengurangan bilangan "+ b2 +" - "+ b1 +" = "+ min);
        System.out.println("Hasil pengalian bilangan "+ b1 +" x "+ b2 +" = "+ kali);
        System.out.println("Hasil pembagian bilangan "+ b1 +" : "+ b2 +" = "+ String.format("%.2f", bagi));
            
    }
    
}
