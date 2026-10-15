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
public class Sisa_bagi_dan_pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        int sisa = a % b;
        double pangkat = Math.pow(a, b);

        System.out.println("Sisa bagi: " + sisa);
        System.out.println("Pangkat: " + (int)pangkat);
    }
}
