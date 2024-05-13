/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsdidok;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class UTSDidok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];

 
        System.out.println("Masukkan nilai untuk Matriks A:");
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print("Masukan Angka MatriksA ke-[" + baris + "][" + kolom + "]: ");
                matriksA[baris][kolom] = input.nextInt();
            }
        }

 
        System.out.println("\nMasukkan nilai untuk Matriks B:");
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print("Masukan Angka MatriksB ke-[" + baris + "][" + kolom + "]: ");
                matriksB[baris][kolom] = input.nextInt();
            }
        }

  
        System.out.println("\nMatriks A:");
        cetakMatriks(matriksA);
        System.out.println("\nMatriks B:");
        cetakMatriks(matriksB);

   
        int[][] hasilPenjumlahan = new int[2][2];
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                hasilPenjumlahan[baris][kolom] = matriksA[baris][kolom] + matriksB[baris][kolom];
            }
        }
        System.out.println("\nHasil Penjumlahan Matriks:");
        cetakMatriks(hasilPenjumlahan);

        int[][] hasilPerkalian = new int[2][2];
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                hasilPerkalian[baris][kolom] = 0;
                for (int k = 0; k < 2; k++) {
                    hasilPerkalian[baris][kolom] += matriksA[baris][k] * matriksB[k][kolom];
                }
            }
        }
        System.out.println("\nHasil Perkalian Matriks:");
        cetakMatriks(hasilPerkalian);
    }

    public static void cetakMatriks(int[][] matriks) {
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();

        }

    
    }
    
}
