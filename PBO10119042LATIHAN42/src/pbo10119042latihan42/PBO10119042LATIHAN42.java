/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan42;

import java.util.Scanner;
/**
 *
 * @Muhammad Rifqu Abdillah
 */
public class PBO10119042LATIHAN42 {

    /**
     * Nama     :Muhammad Rifqu Abdillah
     * Kelas    :IF-1
     * NIM      :10119042
     * Deskripsi : Program ini berisi program untuk menampilkan TABUNGAN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal: ");
        int saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah Uang yang Diambil: ");
        int jumlah = scanner.nextInt();
        
        System.out.println("Saldo Anda Sekarang: " + tabungan.ambilUang(jumlah));
        
    }
    
}
