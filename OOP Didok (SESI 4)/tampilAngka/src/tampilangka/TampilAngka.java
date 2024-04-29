/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilangka;
import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class TampilAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, x, y;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter FSirst Number ");
        x= sc.nextInt();
        System.out.print("Enter Second Number ");
        y= sc.nextInt();
        
        for ( i = x; i <= y; i++ ) {
            System.out.println(i);
        }
    }
    
}
