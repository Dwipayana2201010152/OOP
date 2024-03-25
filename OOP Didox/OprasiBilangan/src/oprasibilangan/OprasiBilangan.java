/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oprasibilangan;

/**
 *
 * @author INSTIKI
 */
public class OprasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b1,b2,b3,jml1,jml2,bagi,kali;
        b1=21;
        b2=12;
        b3=03;
        jml1= b1 + b2 - b3;
        jml2= b1 - b2 + b3;
        bagi= b1 / b3;
        kali= b1 * b2;
        System.out.println("Hasil " + b1 + " + " + b2 + " - " + b3 + " = " + jml1);
        System.out.println("Hasil " + b1 + " - " + b2 + " + " + b3 + " = " + jml2);
        System.out.println("Hasil " + b1 + " dibagi " + b3 + " = " + bagi);
        System.out.println("Hasil " + b1 + " x " + b2 + " = " + kali);


              
        
    }
    
}
