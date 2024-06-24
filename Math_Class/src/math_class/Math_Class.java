/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math_class;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Math_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int pilih_menu;
        String lagi;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------Mathematic Application----------");
        
        
         do {
            System.out.println("\nPilih Menu Yang Anda Inginkan: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Pangkat");
            System.out.println("6. Faktorial");
            System.out.println("7. Logaritma");
            System.out.println("8. FPB-KPK");
            System.out.println("9. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            pilih_menu = scanner.nextInt();
            
            switch (pilih_menu){
                case 1:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka Pertama: ");
                    int x = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    int y = scanner.nextInt();
                    jumlah(x, y);
                    break;
                case 2:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka Pertama: ");
                    x = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    y = scanner.nextInt();
                    kurang(x, y);
                    break;
                case 3:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka Pertama: ");
                    x = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    y = scanner.nextInt();
                    kali(x, y);
                    break;
                case 4:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka Pertama: ");
                    x = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    y = scanner.nextInt();
                    bagi(x, y);
                    break;
                case 5:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka Dasar: ");
                    int a = scanner.nextInt();
                    System.out.print("Masukkan Pangkat: ");
                    int b = scanner.nextInt();
                    pangkat(a, b);
                    break;
                case 6:
                    System.out.println("\n=============================================");
                    System.out.print("Masukkan Angka: ");
                    int z = scanner.nextInt();
                    faktorial(z);
                    break;
                case 7:
                    System.out.println("\n=============================================");
                    System.out.print("Masukan Logaritma: ");
                    int p = scanner.nextInt();
                    System.out.print("Masukan Basis: ");
                    int j = scanner.nextInt();
                    log(p, j);
                    break;
                case 8:
                    System.out.println("\n=============================================");
                    System.out.print("Masukan Angka Pertama: ");
                    int k = scanner.nextInt();
                    System.out.print("Masukan Angka Kedua: ");
                    int v = scanner.nextInt();
                    kf(k, v);
                    break;
                default:
                    System.out.println("\n=============================================");
                    System.out.println("Pilihan Tidak ada, Silahkan Coba Lagi.");
                    System.out.println("=============================================");
                    break;
            }
            if (pilih_menu != 9) {
                System.out.println("=============================================");
                System.out.print("\nIngin Memilih Menu Lagi? (y/t): ");
                lagi = scanner.next();
            } else {
                lagi = "t";
                System.out.println("=============================================");
            }
            
        } while(lagi.equalsIgnoreCase("y"));
        
        scanner.close(); 
        
        System.out.println("----------End Of Application----------");
        
        // TODO code application logic here
    }
    
    public static void jumlah(int b1, int b2) {
        int hasil;
        hasil = b1 + b2;
        System.out.println(b1 + " + " + b2 + " = " + hasil);
    }
    
    public static void kurang(int b1, int b2) {
        int hasil;
        hasil = b1 - b2;
        System.out.println(b1 + " - " + b2 + " = " + hasil);
    }
    
    public static void kali(int b1, int b2) {
        int hasil;
        hasil = b1 * b2;
        System.out.println(b1 + " x " + b2 + " = " + hasil);
    }
    
    public static void bagi(int b1, int b2) {
        int hasil;
        hasil = b1 / b2;
        System.out.println(b1 + " / " + b2 + " = " + hasil);
    }
    
    public static void pangkat(int a, int n) {
        int i;
        int hasil = 1;
        for(i = 1; i <= n; i++){
            
            hasil = hasil * a;
            
        }
        System.out.println(a + " ^ " + n + " = " + hasil);
    }
    
     public static void faktorial(int n) {
        int hasil;
        hasil= 1;
        StringBuilder sb = new StringBuilder();
        
        
        for( int i = n; i > 0; i-- ){
            hasil *= i;
            sb.append(i);
            if(i > 1){
                sb.append(" x ");
            }
        }
        sb.append(" = ");
        String resultF = sb.toString();
        System.out.println(resultF + hasil);
    }
     public static void kf(int a, int b) {
        int resultKPK = (a * b) / fpbHelper(a, b);
        int resultFPB = fpbHelper(a, b);
        System.out.println("KPK dari " + a + " dan " + b + " adalah: " + resultKPK);
        System.out.println("FPB dari " + a + " dan " + b + " adalah: " + resultFPB);
    }

    private static int fpbHelper(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void log(double base, double value) {
        double result = Math.log(value) / Math.log(base);
        System.out.println("Logaritma dari " + value + " dengan basis " + base + " adalah: " + result);
    }
}
