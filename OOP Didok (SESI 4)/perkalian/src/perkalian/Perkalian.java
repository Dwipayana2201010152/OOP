/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;
import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, x, y, z;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Perkalian: ");
        x= sc.nextInt();
        System.out.print("Enter FSirst Number ");
        y= sc.nextInt();
        System.out.print("Enter Second Number ");
        z= sc.nextInt();
        
        for ( i = y; i <= z; i++ ) {
            int a= x * i;
            System.out.println( x + "x" + i + "=" + a );
        }   
    }
}
