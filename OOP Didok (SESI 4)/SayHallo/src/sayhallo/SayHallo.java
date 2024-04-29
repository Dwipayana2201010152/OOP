/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayhallo;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class SayHallo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n1, n2, n3;
        int t1, u1;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");
        n1= sc.nextLine();
        
        System.out.print("Enter Your NIM: ");
        n3= sc.nextLine();
        
        System.out.print("Enter Where Your live: ");
        n2= sc.nextLine();
        
        System.out.print("Enter Your Birth Year: ");
        t1= sc.nextInt();
        
        u1= 2024 - t1;

        
        System.out.println("Hello " + n1);
        System.out.println("Saya Tinggal di " + n2);
        System.out.println("Saya sekarang berumur " + u1);
    }
    
}