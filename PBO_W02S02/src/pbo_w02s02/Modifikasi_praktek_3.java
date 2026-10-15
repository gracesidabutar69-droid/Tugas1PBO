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
public class Modifikasi_praktek_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();

        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif!");
            return;
        }

        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}

