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
 */
public class Modifikasi_praktek_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur);
    }
}
