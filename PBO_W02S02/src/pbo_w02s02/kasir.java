/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02;

import java.util.Scanner;

/**
 *
 * @author grace
 * 
 * Nama : Grace Yulia Sidabutar
 * NIM : 41425053
 * 
 */
public class kasir {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama barang: ");
        String nama = sc.nextLine();

        System.out.print("Harga: ");
        int harga = sc.nextInt();

        System.out.print("Jumlah: ");
        int jumlah = sc.nextInt();

        int total = harga * jumlah;
        int diskon = 0;

        if (total >= 100000) {
            diskon = (int)(total * 0.1);
        }

        int bayar = total - diskon;

        System.out.println("Total: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + bayar);
    } 
}
