/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaarray1;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class CobaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] a = new int [5];
        int i;
        int sum=0;
        float avg= 0;
        int max=a[0];
        
        
        
        for (i= 0; i < 5; i++)
        {
            System.out.print("Masukkan Angka ke "+ i +" : ");
            a[i] = sc.nextInt();
        }
        
        System.out.println("-------------------");
        System.out.println("ANGKA YANG DI INPUT");
        System.out.println("-------------------");
        
        for (i= 0; i < 5; i++){
            System.out.println("Angka ke "+ i +" Adalah" +" : " +a[i]);
        }
        
        for ( i = 0; i < 5; i++){
            sum += a[i];
            avg = sum;
            
            if (a[i] > max) {
                max = a[i];
            }
                       
        }
        
        avg = sum / 5;
        
        int min= a[0];
        for ( i = 0; i < 5; i++){
            if (a[i] <min ){
                min= a[i];
            }
        }
    
    
        System.out.println("-------------------");
        System.out.println("Total : " +sum);
        System.out.println("Rata - Rata : " +avg);
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);
            
        } 
    }
    

