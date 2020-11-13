/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan42;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan TABUNGAN
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
